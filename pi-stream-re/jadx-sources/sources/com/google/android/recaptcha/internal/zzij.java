package com.google.android.recaptcha.internal;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzij {
    private static final zzij zzb = new zzij(true);
    final zzle zza = new zzku(16);
    private boolean zzc;
    private boolean zzd;

    private zzij() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002d. Please report as an issue. */
    public static int zza(zzii zziiVar, Object obj) {
        int zzd;
        int zzy;
        zzmb zzd2 = zziiVar.zzd();
        int zza = zziiVar.zza();
        zziiVar.zzg();
        int zzy2 = zzhh.zzy(zza << 3);
        if (zzd2 == zzmb.zzj) {
            zzke zzkeVar = (zzke) obj;
            byte[] bArr = zzjc.zzd;
            if (!(zzkeVar instanceof zzgg)) {
                zzy2 += zzy2;
            } else {
                throw null;
            }
        }
        zzmc zzmcVar = zzmc.INT;
        int i10 = 4;
        switch (zzd2.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i10 = 8;
                return zzy2 + i10;
            case 1:
                ((Float) obj).floatValue();
                return zzy2 + i10;
            case 2:
                i10 = zzhh.zzz(((Long) obj).longValue());
                return zzy2 + i10;
            case 3:
                i10 = zzhh.zzz(((Long) obj).longValue());
                return zzy2 + i10;
            case 4:
                i10 = zzhh.zzu(((Integer) obj).intValue());
                return zzy2 + i10;
            case 5:
                ((Long) obj).longValue();
                i10 = 8;
                return zzy2 + i10;
            case 6:
                ((Integer) obj).intValue();
                return zzy2 + i10;
            case zzaja.zze.zzg /* 7 */:
                ((Boolean) obj).booleanValue();
                i10 = 1;
                return zzy2 + i10;
            case 8:
                if (obj instanceof zzgw) {
                    zzd = ((zzgw) obj).zzd();
                    zzy = zzhh.zzy(zzd);
                    i10 = zzy + zzd;
                    return zzy2 + i10;
                }
                i10 = zzhh.zzx((String) obj);
                return zzy2 + i10;
            case 9:
                i10 = ((zzke) obj).zzn();
                return zzy2 + i10;
            case 10:
                if (obj instanceof zzjj) {
                    zzd = ((zzjj) obj).zza();
                    zzy = zzhh.zzy(zzd);
                    i10 = zzy + zzd;
                    return zzy2 + i10;
                }
                i10 = zzhh.zzv((zzke) obj);
                return zzy2 + i10;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                if (obj instanceof zzgw) {
                    zzd = ((zzgw) obj).zzd();
                    zzy = zzhh.zzy(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzy = zzhh.zzy(zzd);
                }
                i10 = zzy + zzd;
                return zzy2 + i10;
            case 12:
                i10 = zzhh.zzy(((Integer) obj).intValue());
                return zzy2 + i10;
            case 13:
                i10 = obj instanceof zziv ? zzhh.zzu(((zziv) obj).zza()) : zzhh.zzu(((Integer) obj).intValue());
                return zzy2 + i10;
            case 14:
                ((Integer) obj).intValue();
                return zzy2 + i10;
            case 15:
                ((Long) obj).longValue();
                i10 = 8;
                return zzy2 + i10;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i10 = zzhh.zzy((intValue >> 31) ^ (intValue + intValue));
                return zzy2 + i10;
            case 17:
                long longValue = ((Long) obj).longValue();
                i10 = zzhh.zzz((longValue >> 63) ^ (longValue + longValue));
                return zzy2 + i10;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzij zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzkj) {
            return ((zzkj) obj).zzd();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    private final void zzm(Map.Entry entry) {
        zzke zzj;
        zzii zziiVar = (zzii) entry.getKey();
        Object value = entry.getValue();
        boolean z9 = value instanceof zzjj;
        zziiVar.zzg();
        if (zziiVar.zze() == zzmc.MESSAGE) {
            Object zze = zze(zziiVar);
            if (zze == null) {
                this.zza.put(zziiVar, zzl(value));
                if (z9) {
                    this.zzd = true;
                    return;
                }
                return;
            }
            if (!z9) {
                if (zze instanceof zzkj) {
                    zzj = zziiVar.zzc((zzkj) zze, (zzkj) value);
                } else {
                    zzkd zzX = ((zzke) zze).zzX();
                    zziiVar.zzb(zzX, (zzke) value);
                    zzj = zzX.zzj();
                }
                this.zza.put(zziiVar, zzj);
                return;
            }
            throw null;
        }
        if (!z9) {
            this.zza.put(zziiVar, zzl(value));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
    }

    private static boolean zzn(Map.Entry entry) {
        zzii zziiVar = (zzii) entry.getKey();
        if (zziiVar.zze() != zzmc.MESSAGE) {
            return true;
        }
        zziiVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzkf) {
            return ((zzkf) value).zzo();
        }
        if (value instanceof zzjj) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        zzii zziiVar = (zzii) entry.getKey();
        Object value = entry.getValue();
        if (zziiVar.zze() == zzmc.MESSAGE) {
            zziiVar.zzg();
            zziiVar.zzf();
            if (value instanceof zzjj) {
                int zzy = zzhh.zzy(((zzii) entry.getKey()).zza());
                int zza = ((zzjj) value).zza();
                int zzy2 = zzhh.zzy(zza) + zza;
                int zzy3 = zzhh.zzy(24);
                int zzy4 = zzhh.zzy(16);
                int zzy5 = zzhh.zzy(8);
                return zzy3 + zzy2 + zzy4 + zzy + zzy5 + zzy5;
            }
            int zzy6 = zzhh.zzy(((zzii) entry.getKey()).zza());
            int zzy7 = zzhh.zzy(24) + zzhh.zzv((zzke) value);
            int zzy8 = zzhh.zzy(16);
            int zzy9 = zzhh.zzy(8);
            return zzy8 + zzy6 + zzy9 + zzy9 + zzy7;
        }
        return zza(zziiVar, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzij)) {
            return false;
        }
        return this.zza.equals(((zzij) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            i10 += zzo(this.zza.zzg(i11));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i10 += zzo((Map.Entry) it.next());
        }
        return i10;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzij clone() {
        zzij zzijVar = new zzij();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzijVar.zzi((zzii) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzijVar.zzi((zzii) entry.getKey(), entry.getValue());
        }
        zzijVar.zzd = this.zzd;
        return zzijVar;
    }

    public final Object zze(zzii zziiVar) {
        Object obj = this.zza.get(zziiVar);
        if (!(obj instanceof zzjj)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        if (this.zzd) {
            return new zzji(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (!this.zzc) {
            for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
                Map.Entry zzg = this.zza.zzg(i10);
                if (zzg.getValue() instanceof zzit) {
                    ((zzit) zzg.getValue()).zzB();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzh(zzij zzijVar) {
        for (int i10 = 0; i10 < zzijVar.zza.zzb(); i10++) {
            zzm(zzijVar.zza.zzg(i10));
        }
        Iterator it = zzijVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zziv) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zzjj) == false) goto L32;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.recaptcha.internal.zzii r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.zzg()
            com.google.android.recaptcha.internal.zzmb r0 = r6.zzd()
            byte[] r1 = com.google.android.recaptcha.internal.zzjc.zzd
            r7.getClass()
            com.google.android.recaptcha.internal.zzmb r1 = com.google.android.recaptcha.internal.zzmb.zza
            com.google.android.recaptcha.internal.zzmc r1 = com.google.android.recaptcha.internal.zzmc.INT
            com.google.android.recaptcha.internal.zzmc r0 = r0.zza()
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L47;
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L2f;
                case 7: goto L26;
                case 8: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L57
        L1d:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzke
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzjj
            if (r0 == 0) goto L57
            goto L4b
        L26:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zziv
            if (r0 == 0) goto L57
            goto L4b
        L2f:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4b
        L38:
            boolean r0 = r7 instanceof java.lang.String
            goto L49
        L3b:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L49
        L3e:
            boolean r0 = r7 instanceof java.lang.Double
            goto L49
        L41:
            boolean r0 = r7 instanceof java.lang.Float
            goto L49
        L44:
            boolean r0 = r7 instanceof java.lang.Long
            goto L49
        L47:
            boolean r0 = r7 instanceof java.lang.Integer
        L49:
            if (r0 == 0) goto L57
        L4b:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzjj
            if (r0 == 0) goto L51
            r5.zzd = r1
        L51:
            com.google.android.recaptcha.internal.zzle r0 = r5.zza
            r0.put(r6, r7)
            return
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r6.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            com.google.android.recaptcha.internal.zzmb r6 = r6.zzd()
            com.google.android.recaptcha.internal.zzmc r6 = r6.zza()
            r2[r1] = r6
            java.lang.Class r6 = r7.getClass()
            java.lang.String r6 = r6.getName()
            r7 = 2
            r2[r7] = r6
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzij.zzi(com.google.android.recaptcha.internal.zzii, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzn(this.zza.zzg(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzij(boolean z9) {
        zzg();
        zzg();
    }
}
