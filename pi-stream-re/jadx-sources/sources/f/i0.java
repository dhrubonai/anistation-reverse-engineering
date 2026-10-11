package f;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class i0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f3732a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3733b;

    /* renamed from: c, reason: collision with root package name */
    public Method f3734c;

    /* renamed from: d, reason: collision with root package name */
    public Context f3735d;

    public i0(View view, String str) {
        this.f3732a = view;
        this.f3733b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f3734c == null) {
            View view2 = this.f3732a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f3733b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f3734c = method;
                            this.f3735d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
            }
        }
        try {
            this.f3734c.invoke(this.f3735d, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}
