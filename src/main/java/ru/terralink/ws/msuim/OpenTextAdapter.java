package ru.terralink.ws.msuim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

/**
 * Created by AzarovD on 04.02.2016.
 */
@Configuration("openTextAdapter")
@PropertySource("classpath:config.properties")
public class OpenTextAdapter {

    @Autowired
    private Environment environment;

    private String docManagementWsdlUrl;
    private String authenticationWsdlUrl;
    private String contentserviceWsdlUrl;
    private String otdsAuthenticationWsdlUrl;
    private String openTextUrl;
    private String user;
    private String password;

    @PostConstruct
    public void init(){
        this.user = environment.getProperty("ot.user");
        this.password = environment.getProperty("ot.pswd");
        this.authenticationWsdlUrl = environment.getProperty("ot.auth.url");
        this.docManagementWsdlUrl = environment.getProperty("ot.docmanager.url");
        this.contentserviceWsdlUrl = environment.getProperty("ot.contentservice.url");
        this.otdsAuthenticationWsdlUrl = environment.getProperty("ot.otdsauth.url");
        this.openTextUrl = environment.getProperty("ot.opentext.url");
    }

    public String getDocManagementWsdlUrl() {
        return docManagementWsdlUrl;
    }

    public void setDocManagementWsdlUrl(String docManagementWsdlUrl) {
        this.docManagementWsdlUrl = docManagementWsdlUrl;
    }

    public String getAuthenticationWsdlUrl() {
        return authenticationWsdlUrl;
    }

    public void setAuthenticationWsdlUrl(String authenticationWsdlUrl) {
        this.authenticationWsdlUrl = authenticationWsdlUrl;
    }

    public String getContentserviceWsdlUrl() {
        return contentserviceWsdlUrl;
    }

    public void setContentserviceWsdlUrl(String contentserviceWsdlUrl) {
        this.contentserviceWsdlUrl = contentserviceWsdlUrl;
    }

    public String getOtdsAuthenticationWsdlUrl() {
        return otdsAuthenticationWsdlUrl;
    }

    public void setOtdsAuthenticationWsdlUrl(String otdsAuthenticationWsdlUrl) {
        this.otdsAuthenticationWsdlUrl = otdsAuthenticationWsdlUrl;
    }

    public String getOpenTextUrl() {
        return openTextUrl;
    }

    public void setOpenTextUrl(String openTextUrl) {
        this.openTextUrl = openTextUrl;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
