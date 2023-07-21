package org.test.custom.plugin.jira.webwork;

import com.atlassian.sal.api.pluginsettings.PluginSettings;
import com.atlassian.sal.api.pluginsettings.PluginSettingsFactory;
import com.atlassian.velocity.VelocityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class PluginAction extends JiraWebActionSupport
{
    private static final Logger log = LoggerFactory.getLogger(PluginAction.class);
    private String param;

    @Override
    public String execute() {
        this.param = "hello";
        return SUCCESS;
    }

    public String getParam(){
        return param;
    }

    public void setParam(String param){
        this.param = param;
    }
}
