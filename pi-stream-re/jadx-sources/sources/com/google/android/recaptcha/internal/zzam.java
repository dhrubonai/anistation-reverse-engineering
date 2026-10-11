package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import r6.h0;
import v7.a;
import v7.e;
import v7.f;
import w4.o;

/* loaded from: classes.dex */
public final class zzam {
    private static zzaw zzb;
    private static final a zzd;
    private static final zzt zze;
    private static zzg zzf;
    public static final zzam zza = new zzam();
    private static final String zzc = UUID.randomUUID().toString();

    /* JADX WARN: Multi-variable type inference failed */
    static {
        o oVar = f.f10678a;
        zzd = new e(false);
        zze = new zzt();
        zzf = new zzg(null, 1, 0 == true ? 1 : 0);
    }

    private zzam() {
    }

    public static final Object zzc(Application application, String str, long j4, zzbq zzbqVar, z6.e eVar) {
        return h0.f1(zze.zzb().b(), new zzah(application, str, j4, null, null), eVar);
    }

    public static final Task zzd(Application application, String str, long j4) {
        return zzj.zza(h0.h(zze.zzb(), new zzak(application, str, j4, null)));
    }

    public static final zzg zze() {
        return zzf;
    }

    public static final void zzf(zzg zzgVar) {
        zzf = zzgVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(4:(2:3|(7:5|6|7|(1:(1:(7:11|12|13|14|15|16|17)(2:25|26))(1:27))(9:55|(5:56|(1:(2:151|152)(4:68|(2:70|71)|63|64))|(2:58|(1:60)(1:66))|63|64)|72|(1:74)(1:150)|(1:(2:77|(2:79|80)(2:81|82))(1:83))(1:149)|84|(1:86)(7:89|(1:91)(2:103|(2:104|(2:147|148)(3:106|(4:119|120|(2:121|(2:145|146)(2:123|(2:126|127)(1:125)))|(2:131|132)(2:129|130))(3:108|109|(2:116|117)(3:113|114|115))|118)))|92|93|94|(1:96)|(1:98))|(1:88)|43)|28|29|(2:31|(2:33|(2:35|(3:37|16|17)(2:38|39))(3:40|(5:42|14|15|16|17)|43))(2:44|45))(2:46|47)))|28|29|(0)(0))|155|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x012f, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0131, code lost:
    
        r5 = p7.j.f8698x;
        r7 = r5.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0139, code lost:
    
        if ((r7 instanceof p7.s) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x013f, code lost:
    
        if (((p7.s) r7).f8737d == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0141, code lost:
    
        r0.p();
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0154, code lost:
    
        if (r5 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0156, code lost:
    
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0159, code lost:
    
        if (r15 != null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0158, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0146, code lost:
    
        p7.j.f8697f.set(r0, 536870911);
        r5.set(r0, p7.b.f8662a);
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x015b, code lost:
    
        r15 = new p7.j(2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x003e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0299, code lost:
    
        r13 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c3 A[Catch: all -> 0x0254, RecaptchaException -> 0x0256, Exception -> 0x028c, TryCatch #5 {RecaptchaException -> 0x0256, Exception -> 0x028c, all -> 0x0254, blocks: (B:29:0x0181, B:31:0x01c3, B:33:0x01cb, B:35:0x01d9, B:37:0x01e3, B:38:0x01eb, B:39:0x020f, B:40:0x0210, B:44:0x0258, B:45:0x0271, B:46:0x0272, B:47:0x028b), top: B:28:0x0181 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0272 A[Catch: all -> 0x0254, RecaptchaException -> 0x0256, Exception -> 0x028c, TryCatch #5 {RecaptchaException -> 0x0256, Exception -> 0x028c, all -> 0x0254, blocks: (B:29:0x0181, B:31:0x01c3, B:33:0x01cb, B:35:0x01d9, B:37:0x01e3, B:38:0x01eb, B:39:0x020f, B:40:0x0210, B:44:0x0258, B:45:0x0271, B:46:0x0272, B:47:0x028b), top: B:28:0x0181 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zza(android.app.Application r31, java.lang.String r32, long r33, com.google.android.recaptcha.internal.zzab r35, android.webkit.WebView r36, com.google.android.recaptcha.internal.zzbq r37, com.google.android.recaptcha.internal.zzt r38, z6.e r39) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzam.zza(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzab, android.webkit.WebView, com.google.android.recaptcha.internal.zzbq, com.google.android.recaptcha.internal.zzt, z6.e):java.lang.Object");
    }
}
