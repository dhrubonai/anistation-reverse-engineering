package defpackage;

import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class z9 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ oa y;

    public /* synthetic */ z9(oa oaVar, byte b) {
        this.x = b;
        this.y = oaVar;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        jg jgVar;
        byte b = this.x;
        int i = 0;
        oa oaVar = this.y;
        switch (b) {
            case 0:
                og ogVar = oaVar.n0;
                if (ogVar != null) {
                    int childCount = ogVar.getChildCount();
                    while (i < childCount) {
                        View childAt = ogVar.getChildAt(i);
                        if (childAt instanceof jg) {
                            jgVar = (jg) childAt;
                        } else {
                            jgVar = null;
                        }
                        if (jgVar != null && jgVar.isLayoutRequested()) {
                            jgVar.layout(jgVar.getLeft(), jgVar.getTop(), jgVar.getRight(), jgVar.getBottom());
                        }
                        i++;
                    }
                }
                return pn6.a;
            case 1:
                if (oaVar.isAttachedToWindow()) {
                    if (oa.j1 == null) {
                        c7 c7Var = new c7((byte) 1);
                        oa.j1 = c7Var;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (oa.f1 == null) {
                                oa.f1 = Class.forName("android.os.SystemProperties");
                            }
                            Method method = oa.h1;
                            if (method == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = oa.f1;
                                if (cls != null) {
                                    method = cls.getDeclaredMethod("addChangeCallback", Runnable.class);
                                } else {
                                    method = null;
                                }
                                oa.h1 = method;
                            }
                            if (method != null) {
                                method.invoke(null, c7Var);
                            }
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    f44 f44Var = oa.i1;
                    synchronized (f44Var) {
                        f44Var.a(oaVar);
                    }
                }
                return pn6.a;
            case 2:
                Boolean bool = (Boolean) oaVar.M.getValue();
                bool.getClass();
                return bool;
            case 3:
                LocaleList locales = oaVar.getConfiguration().getLocales();
                gk3 gk3Var = new gk3(new hk3(locales));
                if (locales.isEmpty()) {
                    gk3Var = new gk3(new hk3(LocaleList.getDefault()));
                }
                hk3 hk3Var = gk3Var.a;
                int size = hk3Var.a.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    Locale locale = hk3Var.a.get(i);
                    locale.getClass();
                    arrayList.add(new ek3(locale));
                    i++;
                }
                return new fk3(arrayList);
            default:
                MotionEvent motionEvent = oaVar.K0;
                if (motionEvent != null) {
                    boolean contains = te4.I(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = oaVar.K0;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i = 1;
                    }
                    if (contains && i != 0) {
                        oaVar.L0 = SystemClock.uptimeMillis();
                        oaVar.post(oaVar.S0);
                    }
                }
                oaVar.Y0.invoke();
                return pn6.a;
        }
    }
}
