package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Locale;
import java.util.MissingResourceException;

/* loaded from: classes.dex */
public final class zzbf {
    public static final zzbe zza = new zzbe(null);
    private static zzmo zzb;
    private final String zzc;
    private final zzac zzd;
    private final zznc zze;
    private final long zzf;

    public zzbf(zzbb zzbbVar, String str, zzac zzacVar) {
        this.zzc = str;
        this.zzd = zzacVar;
        zznc zzi = zznf.zzi();
        this.zze = zzi;
        this.zzf = System.currentTimeMillis();
        zzi.zzp(zzbbVar.zza());
        zzi.zzd(zzbbVar.zzb());
        zzi.zzr(zzbbVar.zzc());
        if (zzbbVar.zzd() != null) {
            zzi.zzu(zzbbVar.zzd());
        }
        zzi.zzt(zzmg.zzc(zzmg.zzb(System.currentTimeMillis())));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x0045
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    private static final com.google.android.recaptcha.internal.zzmo zzb(android.content.Context r7) {
        /*
            java.lang.String r0 = "unknown"
            r1 = 33
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            java.lang.String r3 = "com.google.android.gms.version"
            r4 = -1
            if (r2 < r1) goto L29
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            java.lang.String r5 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            android.content.pm.PackageManager$ApplicationInfoFlags r6 = androidx.activity.k.c()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            android.content.pm.ApplicationInfo r2 = androidx.activity.k.a(r2, r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            int r2 = r2.getInt(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            if (r2 != r4) goto L24
            goto L45
        L24:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            goto L46
        L29:
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            java.lang.String r5 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            int r2 = r2.getInt(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            if (r2 != r4) goto L40
            goto L45
        L40:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            goto L46
        L45:
            r2 = r0
        L46:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            if (r3 < r1) goto L63
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            android.content.pm.PackageManager$PackageInfoFlags r3 = androidx.activity.k.d()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            android.content.pm.PackageInfo r7 = androidx.activity.k.b(r1, r7, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            long r3 = com.google.android.gms.internal.p002firebaseauthapi.a.c(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            goto L8f
        L63:
            r1 = 28
            r4 = 0
            if (r3 < r1) goto L7d
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            long r3 = com.google.android.gms.internal.p002firebaseauthapi.a.c(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            goto L8f
        L7d:
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            int r7 = r7.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
        L8f:
            com.google.android.recaptcha.internal.zzmn r7 = com.google.android.recaptcha.internal.zzmo.zzf()
            int r1 = android.os.Build.VERSION.SDK_INT
            r7.zzd(r1)
            r7.zzq(r2)
            java.lang.String r1 = "18.4.0"
            r7.zzs(r1)
            java.lang.String r1 = android.os.Build.MODEL
            r7.zzp(r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r7.zzr(r1)
            r7.zze(r0)
            com.google.android.recaptcha.internal.zzit r7 = r7.zzj()
            com.google.android.recaptcha.internal.zzmo r7 = (com.google.android.recaptcha.internal.zzmo) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbf.zzb(android.content.Context):com.google.android.recaptcha.internal.zzmo");
    }

    public final zznf zza(int i10, zzmr zzmrVar, Context context) {
        String str;
        String str2 = "";
        long currentTimeMillis = System.currentTimeMillis() - this.zzf;
        zznc zzncVar = this.zze;
        zzncVar.zze(currentTimeMillis);
        zzncVar.zzv(i10);
        if (zzmrVar != null) {
            this.zze.zzq(zzmrVar);
        }
        if (zzb == null) {
            zzb = zzb(context);
        }
        try {
            str = Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused) {
            str = "";
        }
        try {
            str2 = Locale.getDefault().getISO3Country();
        } catch (MissingResourceException unused2) {
        }
        zznc zzncVar2 = this.zze;
        String str3 = this.zzc;
        zznq zzf = zznr.zzf();
        zzf.zzq(str3);
        zzmo zzmoVar = zzb;
        if (zzmoVar == null) {
            zzmoVar = zzb(context);
        }
        zzf.zzd(zzmoVar);
        zzf.zzp(str);
        zzf.zze(str2);
        zzncVar2.zzs((zznr) zzf.zzj());
        return (zznf) this.zze.zzj();
    }
}
