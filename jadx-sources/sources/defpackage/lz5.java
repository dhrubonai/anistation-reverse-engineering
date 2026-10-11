package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.anistation.android.R;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class lz5 {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        if ((r16[r5] & 192) == 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if ((r16[r5] & 192) == 128) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz5.a(byte[], int, int):java.lang.String");
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final ow6 c(View view) {
        ow6 ow6Var;
        Object tag = view.getTag(R.id.coil3_request_manager);
        ow6 ow6Var2 = null;
        if (tag instanceof ow6) {
            ow6Var = (ow6) tag;
        } else {
            ow6Var = null;
        }
        if (ow6Var == null) {
            synchronized (view) {
                try {
                    Object tag2 = view.getTag(R.id.coil3_request_manager);
                    if (tag2 instanceof ow6) {
                        ow6Var2 = (ow6) tag2;
                    }
                    if (ow6Var2 == null) {
                        ow6Var2 = new ow6(view);
                        view.addOnAttachStateChangeListener(ow6Var2);
                        view.setTag(R.id.coil3_request_manager, ow6Var2);
                    }
                } finally {
                }
            }
            return ow6Var2;
        }
        return ow6Var;
    }

    public static void d(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            try {
                ActivityOptions makeBasic = ActivityOptions.makeBasic();
                if (i >= 36) {
                    makeBasic.setPendingIntentBackgroundActivityStartMode(4);
                } else {
                    makeBasic.setPendingIntentBackgroundActivityStartMode(1);
                }
                pendingIntent.send(makeBasic.toBundle());
                return;
            } catch (PendingIntent.CanceledException e) {
                Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
                return;
            }
        }
        pendingIntent.send();
    }

    public static final Object e(ec5 ec5Var, boolean z, Object obj, ic2 ic2Var) {
        Object dr0Var;
        Object R;
        try {
            if (!(ic2Var instanceof h30)) {
                dr0Var = wc7.X(ic2Var, obj, ec5Var);
            } else {
                wk6.j(2, ic2Var);
                dr0Var = ic2Var.invoke(obj, ec5Var);
            }
        } catch (ih1 e) {
            Throwable th = e.x;
            ec5Var.Q(new dr0(th, false));
            throw th;
        } catch (Throwable th2) {
            dr0Var = new dr0(th2, false);
        }
        w11 w11Var = w11.x;
        if (dr0Var == w11Var || (R = ec5Var.R(dr0Var)) == u43.b) {
            return w11Var;
        }
        ec5Var.j0();
        if (R instanceof dr0) {
            if (!z) {
                Throwable th3 = ((dr0) R).a;
                if ((th3 instanceof qf6) && ((qf6) th3).x == ec5Var) {
                    if (dr0Var instanceof dr0) {
                        throw ((dr0) dr0Var).a;
                    }
                    return dr0Var;
                }
            }
            throw ((dr0) R).a;
        }
        return u43.a(R);
    }

    public static final String f(int i, kd2 kd2Var) {
        return ((Resources) kd2Var.j(eb.c)).getString(i);
    }

    public static final String g(int i, Object[] objArr, kd2 kd2Var) {
        return ((Resources) kd2Var.j(eb.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static String h(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
