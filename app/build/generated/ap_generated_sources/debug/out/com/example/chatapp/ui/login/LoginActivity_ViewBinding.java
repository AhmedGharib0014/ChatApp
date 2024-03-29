// Generated code from Butter Knife. Do not modify!
package com.example.chatapp.ui.login;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.chatapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target, View source) {
    this.target = target;

    target.loginEmail = Utils.findRequiredViewAsType(source, R.id.loginEmail, "field 'loginEmail'", EditText.class);
    target.LoginPassword = Utils.findRequiredViewAsType(source, R.id.LoginPassword, "field 'LoginPassword'", EditText.class);
    target.loginButton = Utils.findRequiredViewAsType(source, R.id.loginButton, "field 'loginButton'", Button.class);
    target.loginByPhone = Utils.findRequiredViewAsType(source, R.id.loginByPhone, "field 'loginByPhone'", Button.class);
    target.needAccount = Utils.findRequiredViewAsType(source, R.id.needAccount, "field 'needAccount'", Button.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressbarLayout, "field 'progressBar'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.loginEmail = null;
    target.LoginPassword = null;
    target.loginButton = null;
    target.loginByPhone = null;
    target.needAccount = null;
    target.progressBar = null;
  }
}
