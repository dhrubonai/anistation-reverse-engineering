package i;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class i implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f5202c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public final Object f5203a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f5204b;

    public i(Object obj, String str) {
        this.f5203a = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f5204b = cls.getMethod(str, f5202c);
        } catch (Exception e10) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e10);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f5204b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f5203a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
