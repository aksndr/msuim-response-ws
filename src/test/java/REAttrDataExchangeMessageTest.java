import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.terralink.ws.msuim.OpenTextAdapter;
import ru.terralink.ws.msuim.impl.REAttrDataExchangeService;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import static ru.terralink.ws.msuim.constant.REAttrDataExchangeOutConstant.*;
import static ru.terralink.ws.msuim.constant.REAttrDataExchangeOutConstant.SEPARATOR;
import static ru.terralink.ws.msuim.constant.REAttrDataExchangeOutConstant.UTF_8;

public class REAttrDataExchangeMessageTest {
    private static final Logger logger = LoggerFactory.getLogger(REAttrDataExchangeMessageTest.class.getSimpleName());
    @org.junit.Test
    public void reAttrDataExchangeMessageTest() throws Exception {



    }

    @org.junit.Test
    public void getDataIDByDocNumTest() throws Exception {
        byte[] httPostRequest = createHttpPostRequest("55555", MSUIMSYNC_GET_DATAID_BY_DOCNUM);

        String response = post(httPostRequest);
        JSONObject o = new JSONObject(response.toString());
        if (!o.getBoolean("ok")){
            throw new Exception(o.getString("errMsg"));
        }

        Integer dataId = o.getInt("value");

        logger.info("Response: \n" + dataId);
    }

    private byte[] createHttpPostRequest(Object o, String funcName) {
        StringBuilder strPostRequest = new StringBuilder();

        if (o == null) {
            logger.error("Failed to build Http Request. The incoming params is null.");
            return null;
        }

        try {
            strPostRequest.append(URLEncoder.encode(FUNCTION_PREFIX, UTF_8))
                    .append(SEPARATOR)
                    .append(URLEncoder.encode(funcName, UTF_8));
        } catch (UnsupportedEncodingException e) {
            logger.error("Failed encode for " + FUNCTION_PREFIX + SEPARATOR + funcName);
        }

        strPostRequest.append(AND);
        try {
            strPostRequest.append(URLEncoder.encode(CONTENT, UTF_8))
                    .append(SEPARATOR)
                    .append(URLEncoder.encode(o.toString(), UTF_8));
        } catch (UnsupportedEncodingException e) {
            logger.error("Failed encode params:  " + e);
        }

        logger.info("Request: \n" + strPostRequest.toString());
        return strPostRequest.toString().getBytes();
    }

    private String post(byte[] httPostRequest) {
        try {
            URL url = new URL("http://varzamastseva/OTCS/cs.exe");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setInstanceFollowRedirects(false);
            conn.setRequestMethod(REQUEST_METHOD_POST);
            conn.setDoOutput(true);
            conn.setConnectTimeout(5000);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("charset", "utf-8");
            conn.setRequestProperty("Content-Length", Integer.toString(httPostRequest.length));
            conn.setUseCaches(false);

            DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
            wr.write(httPostRequest);
            wr.flush();
            wr.close();

            int responseCode = conn.getResponseCode();
            logger.info("POST Response Code :: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                logger.info("Pass arguments: " + response.toString());
                return response.toString();
            } else {
                String location = conn.getHeaderField("Location");
                logger.error("POST request not worked. \nThe header field is " + location);
            }
        } catch (Exception e) {
            logger.error(RESULT_FAILED + "\n" + e.getMessage());
        }
        return null;
    }

}
