package r;

import android.widget.LinearLayout;
import android.widget.TextView;
import f.r0;
import f1.o;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import r6.l0;
import r6.m0;
import r6.o0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static void a(y2.l lVar, byte[] bArr, r0 r0Var, w.f fVar) {
        lVar.o(bArr, 0, bArr.length, r0Var, fVar);
    }

    public static y2.b b(y2.l lVar, byte[] bArr, int i10, int i11) {
        m0 m0Var = o0.f9505b;
        l0 l0Var = new l0();
        lVar.o(bArr, i10, i11, r0.f3774c, new w.f(l0Var, 18));
        return new y2.b(l0Var.C0());
    }

    public static LinearLayout.LayoutParams c(TextView textView, int i10, int i11, int i12) {
        textView.setGravity(i10);
        return new LinearLayout.LayoutParams(i11, i12);
    }

    public static String d(String str, String str2) {
        return str + str2;
    }

    public static String e(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ Iterator f() {
        try {
            return Arrays.asList(new q7.b()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static v6.b g(x7.g gVar, int i10) {
        return v6.a.a(new x7.f(gVar, i10));
    }

    public static /* synthetic */ void h() {
    }

    public static void i(int i10, int i11, LinearLayout linearLayout, TextView textView) {
        linearLayout.addView(textView, new LinearLayout.LayoutParams(i10, i11));
    }

    public static void j(String str, String str2, String str3) {
        o.f(str3, str + str2);
    }

    public static /* synthetic */ Iterator k() {
        try {
            return Arrays.asList(new q7.a()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ String l(int i10) {
        if (i10 == 1) {
            return "QUEUED";
        }
        if (i10 == 2) {
            return "DOWNLOADING";
        }
        if (i10 == 3) {
            return "PAUSED";
        }
        if (i10 == 4) {
            return "COMPLETED";
        }
        if (i10 == 5) {
            return "FAILED";
        }
        if (i10 == 6) {
            return "CANCELLED";
        }
        throw null;
    }

    public static /* synthetic */ String m(int i10) {
        return i10 == 1 ? "UNKNOWN" : i10 == 2 ? "HORIZONTAL_DIMENSION" : i10 == 3 ? "VERTICAL_DIMENSION" : i10 == 4 ? "LEFT" : i10 == 5 ? "RIGHT" : i10 == 6 ? "TOP" : i10 == 7 ? "BOTTOM" : i10 == 8 ? "BASELINE" : "null";
    }

    public static /* synthetic */ String n(int i10) {
        return i10 == 1 ? "SOURCE" : i10 == 2 ? "TRANSFORMED" : i10 == 3 ? "NONE" : "null";
    }

    public static /* synthetic */ String o(int i10) {
        return i10 == 1 ? "INITIALIZE" : i10 == 2 ? "SWITCH_TO_SOURCE_SERVICE" : i10 == 3 ? "DECODE_DATA" : "null";
    }

    public static /* synthetic */ String p(int i10) {
        return i10 == 1 ? "INITIALIZE" : i10 == 2 ? "RESOURCE_CACHE" : i10 == 3 ? "DATA_CACHE" : i10 == 4 ? "SOURCE" : i10 == 5 ? "ENCODE" : i10 == 6 ? "FINISHED" : "null";
    }

    public static /* synthetic */ int q(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("QUEUED")) {
            return 1;
        }
        if (str.equals("DOWNLOADING")) {
            return 2;
        }
        if (str.equals("PAUSED")) {
            return 3;
        }
        if (str.equals("COMPLETED")) {
            return 4;
        }
        if (str.equals("FAILED")) {
            return 5;
        }
        if (str.equals("CANCELLED")) {
            return 6;
        }
        throw new IllegalArgumentException("No enum constant msr.pistream.app.download.DownloadEntry.State.".concat(str));
    }
}
