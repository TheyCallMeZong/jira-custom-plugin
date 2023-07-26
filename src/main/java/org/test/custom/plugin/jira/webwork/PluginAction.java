package org.test.custom.plugin.jira.webwork;

import com.atlassian.jira.user.ApplicationUser;
import com.atlassian.jira.user.UserUtils;
import com.atlassian.jira.web.action.JiraWebActionSupport;
import com.google.common.collect.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class PluginAction extends JiraWebActionSupport
{
    private static final Logger log = LoggerFactory.getLogger(PluginAction.class);
    private String param;
    private Set<ApplicationUser> users;
    @Override
    public String execute() {
        this.users = Sets.newHashSet(UserUtils.getAllUsers());
        this.param = "hello";

        return SUCCESS;
    }

    public Set<ApplicationUser> getUsers(){
        return users;
    }

    public void setUsers(Set<ApplicationUser> users) {
        this.users = users;
    }

    public String getParam(){
        return param;
    }

    public void setParam(String param){
        this.param = param;
    }
}
