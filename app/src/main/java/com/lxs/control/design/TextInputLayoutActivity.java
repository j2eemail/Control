package com.lxs.control.design;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.lxs.control.R;

/**
 * Android 5.0
 * Created by Administrator on 2017/5/22.
 */

public class TextInputLayoutActivity extends AppCompatActivity {

    private TextInputLayout usernameWrapper;
    private TextInputLayout passwordWrapper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_textinputlayout);

        usernameWrapper = (TextInputLayout) findViewById(R.id.usernameWrapper);
        passwordWrapper = (TextInputLayout) findViewById(R.id.passwordWrapper);

        usernameWrapper.setHint("Username");
        passwordWrapper.setHint("Password");
    }

    public void loginOnClick(View view) {
        hideKeyboard();
        String username = usernameWrapper.getEditText().getText().toString();
        String password = passwordWrapper.getEditText().getText().toString();
        if (!validateUsername(username)) {
            usernameWrapper.setError("username error!");
        } else if (!validatePassword(password)) {
            passwordWrapper.setError("password error!");
        } else {
            Toast.makeText(this, "登陆中。。。。", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validateUsername(String username) {
        if (!TextUtils.isEmpty(username) && username.length() > 4) {
            usernameWrapper.setError(null);
            return true;
        }
        return false;
    }

    private boolean validatePassword(String password) {
        if (!TextUtils.isEmpty(password) && password.length() > 4) {
            passwordWrapper.setError(null);
            return true;
        }
        return false;
    }

    private void hideKeyboard() {
        View view = getCurrentFocus();
        if (view != null) {
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).
                    hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
}
