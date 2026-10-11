package g8;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import msr.pistream.app.ui.player.PlayerActivity;
import w8.i;

/* loaded from: classes.dex */
public abstract class a extends androidx.appcompat.app.a {
    @Override // androidx.appcompat.app.a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        if (configuration.fontScale != 1.0f) {
            configuration.fontScale = 1.0f;
            context = context.createConfigurationContext(configuration);
        }
        super.attachBaseContext(context);
    }

    public final void l(View view) {
        if (i.f(this) && !(this instanceof PlayerActivity)) {
            int e10 = i.e(this, 32);
            view.setPadding(view.getPaddingLeft() + e10, view.getPaddingTop(), view.getPaddingRight() + e10, view.getPaddingBottom());
        }
    }

    @Override // androidx.appcompat.app.a, androidx.activity.j, android.app.Activity
    public void setContentView(View view) {
        l(view);
        super.setContentView(view);
    }

    @Override // androidx.appcompat.app.a, androidx.activity.j, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l(view);
        super.setContentView(view, layoutParams);
    }
}
