package b5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import msr.pistream.app.download.PiStreamDownloadService;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1518a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f1519b;

    static {
        AtomicBoolean atomicBoolean = g.f1521a;
        f1518a = 12451000;
        f1519b = new e();
    }

    public Intent a(Context context, String str, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && j5.a.K(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f1518a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(j5.b.a(context).c(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(PiStreamDownloadService.EXTRA_ID, "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public int b(Context context) {
        return c(context, f1518a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|4|(4:8|2c|15|(2:17|(2:19|20))(2:22|23))|37|(4:39|(3:41|(1:47)(1:45)|46)|48|(12:50|(1:52)(1:105)|53|(2:101|102)(1:55)|56|57|58|(1:60)(2:(2:71|(1:73))|(7:79|(1:81)(1:98)|(1:83)|(1:85)(4:86|(2:92|93)|88|(1:90)(1:91))|62|(1:(1:65)(1:66))|(1:68)(1:69))(1:78))|61|62|(0)|(0)(0)))|106|(0)(0)|53|(0)(0)|56|57|58|(0)(0)|61|62|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x019e, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.e.c(android.content.Context, int):int");
    }
}
