package defpackage;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Path;
import android.view.DisplayCutout;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class hb {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.jb r6, android.util.LongSparseArray r7) {
        /*
            int r0 = r7.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L5b
            long r2 = r7.keyAt(r1)
            java.lang.Object r4 = r7.get(r2)
            android.view.translation.ViewTranslationResponse r4 = defpackage.za.j(r4)
            if (r4 == 0) goto L58
            android.view.translation.TranslationResponseValue r4 = defpackage.za.i(r4)
            if (r4 == 0) goto L58
            java.lang.CharSequence r4 = defpackage.za.k(r4)
            if (r4 == 0) goto L58
            a13 r5 = r6.c()
            int r2 = (int) r2
            java.lang.Object r2 = r5.b(r2)
            wh5 r2 = (defpackage.wh5) r2
            if (r2 == 0) goto L58
            uh5 r2 = r2.a
            if (r2 == 0) goto L58
            ph5 r2 = r2.d
            ai5 r3 = defpackage.oh5.l
            p44 r2 = r2.x
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L3f
            r2 = 0
        L3f:
            o3 r2 = (defpackage.o3) r2
            if (r2 == 0) goto L58
            ec2 r2 = r2.b
            ub2 r2 = (defpackage.ub2) r2
            if (r2 == 0) goto L58
            ko r3 = new ko
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.lang.Object r2 = r2.invoke(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L58:
            int r1 = r1 + 1
            goto L5
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb.b(jb, android.util.LongSparseArray):void");
    }

    public static Path c(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float d(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static int e(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.B;
        switch (stopReason) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static void f(jb jbVar, long[] jArr, Consumer consumer) {
        uh5 uh5Var;
        for (long j : jArr) {
            wh5 wh5Var = (wh5) jbVar.c().b((int) j);
            if (wh5Var != null && (uh5Var = wh5Var.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(jbVar.x.getAutofillId(), uh5Var.f);
                Object g = uh5Var.d.x.g(yh5.C);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new ko(hi3.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float g(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void h(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }
}
