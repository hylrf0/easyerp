package org.easyerp.web.listener;

import org.easyerp.common.util.Constants;
import org.easyerp.service.ContextHolder;
import org.easyerp.service.bo.UserInfoBO;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Created by Administrator on 2017/3/16 0016.
 */
public class LoginSessionAttributeListener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        if (Constants.CURRENT_USER.equals(event.getName())) {
            ContextHolder.setUserInfoBO((UserInfoBO) event.getValue());
        }
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        if (Constants.CURRENT_USER.equals(event.getName())) {
            ContextHolder.setUserInfoBO((UserInfoBO)event.getValue());
        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {

    }
}
