package com.google.android.recaptcha.internal;

import androidx.media3.exoplayer.DefaultRenderersFactory;
import com.google.android.gms.common.api.f;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkh<T> implements zzkr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzlv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzke zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzjs zzm;
    private final zzll zzn;
    private final zzif zzo;
    private final zzkk zzp;
    private final zzjz zzq;

    private zzkh(int[] iArr, Object[] objArr, int i10, int i11, zzke zzkeVar, int i12, boolean z9, int[] iArr2, int i13, int i14, zzkk zzkkVar, zzjs zzjsVar, zzll zzllVar, zzif zzifVar, zzjz zzjzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzkeVar instanceof zzit;
        boolean z10 = false;
        if (zzifVar != null && zzifVar.zzj(zzkeVar)) {
            z10 = true;
        }
        this.zzh = z10;
        this.zzj = iArr2;
        this.zzk = i13;
        this.zzl = i14;
        this.zzp = zzkkVar;
        this.zzm = zzjsVar;
        this.zzn = zzllVar;
        this.zzo = zzifVar;
        this.zzg = zzkeVar;
        this.zzq = zzjzVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzkr zzx = zzx(i10);
        int zzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzkr zzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (!zzN(obj2, i10)) {
            return;
        }
        int zzu = zzu(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j4 = zzu;
        Object object = unsafe.getObject(obj2, j4);
        if (object != null) {
            zzkr zzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, j4, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j4, zze);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j4, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (!zzR(obj2, i11, i10)) {
            return;
        }
        int zzu = zzu(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j4 = zzu;
        Object object = unsafe.getObject(obj2, j4);
        if (object != null) {
            zzkr zzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, j4, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j4, zze);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j4, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzG(Object obj, int i10, zzkq zzkqVar) {
        long j4 = i10 & 1048575;
        if (zzM(i10)) {
            zzlv.zzs(obj, j4, zzkqVar.zzs());
        } else if (this.zzi) {
            zzlv.zzs(obj, j4, zzkqVar.zzr());
        } else {
            zzlv.zzs(obj, j4, zzkqVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int zzr = zzr(i10);
        long j4 = 1048575 & zzr;
        if (j4 == 1048575) {
            return;
        }
        zzlv.zzq(obj, j4, (1 << (zzr >>> 20)) | zzlv.zzc(obj, j4));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzlv.zzq(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        if (zzN(obj, i10) == zzN(obj2, i10)) {
            return true;
        }
        return false;
    }

    private static boolean zzM(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int zzr = zzr(i10);
        long j4 = zzr & 1048575;
        if (j4 == 1048575) {
            int zzu = zzu(i10);
            long j10 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzlv.zza(obj, j10)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzlv.zzb(obj, j10)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzlv.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzlv.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzlv.zzc(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzlv.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzlv.zzc(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case zzaja.zze.zzg /* 7 */:
                    return zzlv.zzw(obj, j10);
                case 8:
                    Object zzf = zzlv.zzf(obj, j10);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (zzf instanceof zzgw) {
                        if (zzgw.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzlv.zzf(obj, j10) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzgw.zzb.equals(zzlv.zzf(obj, j10))) {
                        return false;
                    }
                    return true;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzlv.zzc(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzlv.zzc(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzlv.zzc(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzlv.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzlv.zzc(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzlv.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzlv.zzf(obj, j10) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzlv.zzc(obj, j4) & (1 << (zzr >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzN(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzP(Object obj, int i10, zzkr zzkrVar) {
        return zzkrVar.zzl(zzlv.zzf(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzit) {
            return ((zzit) obj).zzG();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        if (zzlv.zzc(obj, zzr(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean zzS(Object obj, long j4) {
        return ((Boolean) zzlv.zzf(obj, j4)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzmd zzmdVar) {
        if (obj instanceof String) {
            zzmdVar.zzG(i10, (String) obj);
        } else {
            zzmdVar.zzd(i10, (zzgw) obj);
        }
    }

    public static zzlm zzd(Object obj) {
        zzit zzitVar = (zzit) obj;
        zzlm zzlmVar = zzitVar.zzc;
        if (zzlmVar == zzlm.zzc()) {
            zzlm zzf = zzlm.zzf();
            zzitVar.zzc = zzf;
            return zzf;
        }
        return zzlmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.recaptcha.internal.zzkh zzm(java.lang.Class r33, com.google.android.recaptcha.internal.zzkb r34, com.google.android.recaptcha.internal.zzkk r35, com.google.android.recaptcha.internal.zzjs r36, com.google.android.recaptcha.internal.zzll r37, com.google.android.recaptcha.internal.zzif r38, com.google.android.recaptcha.internal.zzjz r39) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzkb, com.google.android.recaptcha.internal.zzkk, com.google.android.recaptcha.internal.zzjs, com.google.android.recaptcha.internal.zzll, com.google.android.recaptcha.internal.zzif, com.google.android.recaptcha.internal.zzjz):com.google.android.recaptcha.internal.zzkh");
    }

    private static double zzn(Object obj, long j4) {
        return ((Double) zzlv.zzf(obj, j4)).doubleValue();
    }

    private static float zzo(Object obj, long j4) {
        return ((Float) zzlv.zzf(obj, j4)).floatValue();
    }

    private static int zzp(Object obj, long j4) {
        return ((Integer) zzlv.zzf(obj, j4)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 >= this.zze && i10 <= this.zzf) {
            return zzs(i10, 0);
        }
        return -1;
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j4) {
        return ((Long) zzlv.zzf(obj, j4)).longValue();
    }

    private final zzix zzw(int i10) {
        int i11 = i10 / 3;
        return (zzix) this.zzd[i11 + i11 + 1];
    }

    private final zzkr zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzkr zzkrVar = (zzkr) objArr[i12];
        if (zzkrVar != null) {
            return zzkrVar;
        }
        zzkr zzb2 = zzkn.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzll zzllVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzf = zzlv.zzf(obj, zzu(i10) & 1048575);
        if (zzf == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x005b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final int zza(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13;
        int zzy;
        int zzy2;
        int zzz;
        int zzy3;
        int zzy4;
        int zzy5;
        int zzy6;
        int zzh;
        int zzy7;
        int zzy8;
        int i14;
        int size;
        int zzl;
        int zzy9;
        int zzy10;
        int i15;
        int i16;
        int zzy11;
        int zzy12;
        Unsafe unsafe = zzb;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 1048575;
        int i21 = 1048575;
        int i22 = 0;
        while (i18 < this.zzc.length) {
            int zzu = zzu(i18);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i23 = iArr[i18];
            int i24 = iArr[i18 + 2];
            int i25 = i24 & i20;
            if (zzt <= 17) {
                if (i25 != i21) {
                    if (i25 == i20) {
                        i17 = i22;
                        i10 = i17;
                    } else {
                        i10 = i22;
                        i17 = unsafe.getInt(obj, i25);
                    }
                    i21 = i25;
                } else {
                    i10 = i22;
                }
                int i26 = 1 << (i24 >>> 20);
                i11 = i17;
                i13 = i26;
                i12 = i21;
            } else {
                i10 = i22;
                i11 = i17;
                i12 = i21;
                i13 = i10;
            }
            int i27 = zzu & i20;
            if (zzt >= zzik.zzJ.zza()) {
                zzik.zzW.zza();
            }
            long j4 = i27;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzy = zzhh.zzy(i23 << 3);
                        zzh = zzy + 8;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 1:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzy2 = zzhh.zzy(i23 << 3);
                        zzh = zzy2 + 4;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 2:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzz = zzhh.zzz(unsafe.getLong(obj, j4));
                        zzy3 = zzhh.zzy(i23 << 3);
                        zzh = zzy3 + zzz;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 3:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzz = zzhh.zzz(unsafe.getLong(obj, j4));
                        zzy3 = zzhh.zzy(i23 << 3);
                        zzh = zzy3 + zzz;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 4:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzz = zzhh.zzu(unsafe.getInt(obj, j4));
                        zzy3 = zzhh.zzy(i23 << 3);
                        zzh = zzy3 + zzz;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 5:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzy = zzhh.zzy(i23 << 3);
                        zzh = zzy + 8;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 6:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzy2 = zzhh.zzy(i23 << 3);
                        zzh = zzy2 + 4;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case zzaja.zze.zzg /* 7 */:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzy4 = zzhh.zzy(i23 << 3);
                        zzh = zzy4 + 1;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 8:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        int i28 = i23 << 3;
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof zzgw) {
                            int i29 = zzhh.zzb;
                            int zzd = ((zzgw) object).zzd();
                            zzy5 = zzhh.zzy(zzd) + zzd;
                            zzy6 = zzhh.zzy(i28);
                            zzh = zzy6 + zzy5;
                            i19 += zzh;
                            i18 += 3;
                            i22 = 0;
                            i20 = 1048575;
                            i17 = i11;
                            i21 = i12;
                        } else {
                            zzz = zzhh.zzx((String) object);
                            zzy3 = zzhh.zzy(i28);
                            zzh = zzy3 + zzz;
                            i19 += zzh;
                            i18 += 3;
                            i22 = 0;
                            i20 = 1048575;
                            i17 = i11;
                            i21 = i12;
                        }
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 9:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzh = zzkt.zzh(i23, unsafe.getObject(obj, j4), zzx(i18));
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 10:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzgw zzgwVar = (zzgw) unsafe.getObject(obj, j4);
                        int i30 = zzhh.zzb;
                        int zzd2 = zzgwVar.zzd();
                        zzy5 = zzhh.zzy(zzd2) + zzd2;
                        zzy6 = zzhh.zzy(i23 << 3);
                        zzh = zzy6 + zzy5;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzz = zzhh.zzy(unsafe.getInt(obj, j4));
                        zzy3 = zzhh.zzy(i23 << 3);
                        zzh = zzy3 + zzz;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 12:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzz = zzhh.zzu(unsafe.getInt(obj, j4));
                        zzy3 = zzhh.zzy(i23 << 3);
                        zzh = zzy3 + zzz;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 13:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzy2 = zzhh.zzy(i23 << 3);
                        zzh = zzy2 + 4;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 14:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzy = zzhh.zzy(i23 << 3);
                        zzh = zzy + 8;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 15:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        int i31 = unsafe.getInt(obj, j4);
                        zzy7 = zzhh.zzy(i23 << 3);
                        zzy8 = zzhh.zzy((i31 >> 31) ^ (i31 + i31));
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 16:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        long j10 = unsafe.getLong(obj, j4);
                        zzy7 = zzhh.zzy(i23 << 3);
                        zzy8 = zzhh.zzz((j10 >> 63) ^ (j10 + j10));
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 17:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzh = zzhh.zzt(i23, (zzke) unsafe.getObject(obj, j4), zzx(i18));
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 18:
                    zzh = zzkt.zzd(i23, (List) unsafe.getObject(obj, j4), i10);
                    i19 += zzh;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 19:
                    zzh = zzkt.zzb(i23, (List) unsafe.getObject(obj, j4), i10);
                    i19 += zzh;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 20:
                    i14 = i10;
                    List list = (List) unsafe.getObject(obj, j4);
                    int i32 = zzkt.zza;
                    if (list.size() != 0) {
                        i14 = (zzhh.zzy(i23 << 3) * list.size()) + zzkt.zzg(list);
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 21:
                    i14 = i10;
                    List list2 = (List) unsafe.getObject(obj, j4);
                    int i33 = zzkt.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzkt.zzl(list2);
                        zzy9 = zzhh.zzy(i23 << 3);
                        int i34 = size;
                        i15 = zzy9;
                        i16 = i34;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 22:
                    i14 = i10;
                    List list3 = (List) unsafe.getObject(obj, j4);
                    int i35 = zzkt.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzkt.zzf(list3);
                        zzy9 = zzhh.zzy(i23 << 3);
                        int i342 = size;
                        i15 = zzy9;
                        i16 = i342;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 23:
                    zzh = zzkt.zzd(i23, (List) unsafe.getObject(obj, j4), i10);
                    i19 += zzh;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 24:
                    zzh = zzkt.zzb(i23, (List) unsafe.getObject(obj, j4), i10);
                    i19 += zzh;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 25:
                    i14 = i10;
                    List list4 = (List) unsafe.getObject(obj, j4);
                    int i36 = zzkt.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        i14 = (zzhh.zzy(i23 << 3) + 1) * size2;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 26:
                    i14 = i10;
                    List list5 = (List) unsafe.getObject(obj, j4);
                    int i37 = zzkt.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        boolean z9 = list5 instanceof zzjm;
                        zzy10 = zzhh.zzy(i23 << 3) * size3;
                        if (z9) {
                            zzjm zzjmVar = (zzjm) list5;
                            while (i14 < size3) {
                                Object zzf = zzjmVar.zzf(i14);
                                if (zzf instanceof zzgw) {
                                    int zzd3 = ((zzgw) zzf).zzd();
                                    zzy10 = zzhh.zzy(zzd3) + zzd3 + zzy10;
                                } else {
                                    zzy10 = zzhh.zzx((String) zzf) + zzy10;
                                }
                                i14++;
                            }
                        } else {
                            while (i14 < size3) {
                                Object obj2 = list5.get(i14);
                                if (obj2 instanceof zzgw) {
                                    int zzd4 = ((zzgw) obj2).zzd();
                                    zzy10 = zzhh.zzy(zzd4) + zzd4 + zzy10;
                                } else {
                                    zzy10 = zzhh.zzx((String) obj2) + zzy10;
                                }
                                i14++;
                            }
                        }
                        i14 = zzy10;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 27:
                    i14 = i10;
                    List list6 = (List) unsafe.getObject(obj, j4);
                    zzkr zzx = zzx(i18);
                    int i38 = zzkt.zza;
                    int size4 = list6.size();
                    if (size4 != 0) {
                        int zzy13 = zzhh.zzy(i23 << 3) * size4;
                        while (i14 < size4) {
                            Object obj3 = list6.get(i14);
                            if (obj3 instanceof zzjk) {
                                int zza2 = ((zzjk) obj3).zza();
                                zzy13 = zzhh.zzy(zza2) + zza2 + zzy13;
                            } else {
                                zzy13 = zzhh.zzw((zzke) obj3, zzx) + zzy13;
                            }
                            i14++;
                        }
                        i14 = zzy13;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 28:
                    i14 = i10;
                    List list7 = (List) unsafe.getObject(obj, j4);
                    int i39 = zzkt.zza;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        zzy10 = zzhh.zzy(i23 << 3) * size5;
                        while (i14 < list7.size()) {
                            int zzd5 = ((zzgw) list7.get(i14)).zzd();
                            zzy10 += zzhh.zzy(zzd5) + zzd5;
                            i14++;
                        }
                        i14 = zzy10;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 29:
                    i14 = i10;
                    List list8 = (List) unsafe.getObject(obj, j4);
                    int i40 = zzkt.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzkt.zzk(list8);
                        zzy9 = zzhh.zzy(i23 << 3);
                        int i3422 = size;
                        i15 = zzy9;
                        i16 = i3422;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 30:
                    i14 = i10;
                    List list9 = (List) unsafe.getObject(obj, j4);
                    int i41 = zzkt.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzkt.zza(list9);
                        zzy9 = zzhh.zzy(i23 << 3);
                        int i34222 = size;
                        i15 = zzy9;
                        i16 = i34222;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 31:
                    zzh = zzkt.zzb(i23, (List) unsafe.getObject(obj, j4), i10);
                    i19 += zzh;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 32:
                    zzh = zzkt.zzd(i23, (List) unsafe.getObject(obj, j4), i10);
                    i19 += zzh;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j4);
                    int i42 = zzkt.zza;
                    i16 = list10.size();
                    if (i16 != 0) {
                        zzl = zzkt.zzi(list10);
                        i15 = zzhh.zzy(i23 << 3);
                        i14 = (i15 * i16) + zzl;
                        i19 += i14;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                    i14 = i10;
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j4);
                    int i43 = zzkt.zza;
                    i16 = list11.size();
                    if (i16 != 0) {
                        zzl = zzkt.zzj(list11);
                        i15 = zzhh.zzy(i23 << 3);
                        i14 = (i15 * i16) + zzl;
                        i19 += i14;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                    i14 = i10;
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 35:
                    zzy7 = zzkt.zze((List) unsafe.getObject(obj, j4));
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 36:
                    zzy7 = zzkt.zzc((List) unsafe.getObject(obj, j4));
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 37:
                    zzy7 = zzkt.zzg((List) unsafe.getObject(obj, j4));
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 38:
                    zzy7 = zzkt.zzl((List) unsafe.getObject(obj, j4));
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 39:
                    zzy7 = zzkt.zzf((List) unsafe.getObject(obj, j4));
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 40:
                    zzy7 = zzkt.zze((List) unsafe.getObject(obj, j4));
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 41:
                    zzy7 = zzkt.zzc((List) unsafe.getObject(obj, j4));
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j4);
                    int i44 = zzkt.zza;
                    zzy7 = list12.size();
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 43:
                    zzy7 = zzkt.zzk((List) unsafe.getObject(obj, j4));
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 44:
                    zzy7 = zzkt.zza((List) unsafe.getObject(obj, j4));
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 45:
                    zzy7 = zzkt.zzc((List) unsafe.getObject(obj, j4));
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 46:
                    zzy7 = zzkt.zze((List) unsafe.getObject(obj, j4));
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 47:
                    zzy7 = zzkt.zzi((List) unsafe.getObject(obj, j4));
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 48:
                    zzy7 = zzkt.zzj((List) unsafe.getObject(obj, j4));
                    if (zzy7 > 0) {
                        zzy11 = zzhh.zzy(zzy7);
                        zzy12 = zzhh.zzy(i23 << 3);
                        zzy8 = zzy12 + zzy11;
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j4);
                    zzkr zzx2 = zzx(i18);
                    int i45 = zzkt.zza;
                    int size6 = list13.size();
                    if (size6 != 0) {
                        zzy10 = i10;
                        while (i10 < size6) {
                            zzy10 += zzhh.zzt(i23, (zzke) list13.get(i10), zzx2);
                            i10++;
                        }
                        i14 = zzy10;
                        i19 += i14;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                    i14 = i10;
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    zzjy zzjyVar = (zzjy) unsafe.getObject(obj, j4);
                    if (zzjyVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzjyVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 51:
                    if (zzR(obj, i23, i18)) {
                        zzy = zzhh.zzy(i23 << 3);
                        zzh = zzy + 8;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 52:
                    if (zzR(obj, i23, i18)) {
                        zzy2 = zzhh.zzy(i23 << 3);
                        zzh = zzy2 + 4;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 53:
                    if (zzR(obj, i23, i18)) {
                        zzz = zzhh.zzz(zzv(obj, j4));
                        zzy3 = zzhh.zzy(i23 << 3);
                        zzh = zzy3 + zzz;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 54:
                    if (zzR(obj, i23, i18)) {
                        zzz = zzhh.zzz(zzv(obj, j4));
                        zzy3 = zzhh.zzy(i23 << 3);
                        zzh = zzy3 + zzz;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 55:
                    if (zzR(obj, i23, i18)) {
                        zzz = zzhh.zzu(zzp(obj, j4));
                        zzy3 = zzhh.zzy(i23 << 3);
                        zzh = zzy3 + zzz;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 56:
                    if (zzR(obj, i23, i18)) {
                        zzy = zzhh.zzy(i23 << 3);
                        zzh = zzy + 8;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 57:
                    if (zzR(obj, i23, i18)) {
                        zzy2 = zzhh.zzy(i23 << 3);
                        zzh = zzy2 + 4;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 58:
                    if (zzR(obj, i23, i18)) {
                        zzy4 = zzhh.zzy(i23 << 3);
                        zzh = zzy4 + 1;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 59:
                    if (zzR(obj, i23, i18)) {
                        int i46 = i23 << 3;
                        Object object2 = unsafe.getObject(obj, j4);
                        if (object2 instanceof zzgw) {
                            int i47 = zzhh.zzb;
                            int zzd6 = ((zzgw) object2).zzd();
                            zzy5 = zzhh.zzy(zzd6) + zzd6;
                            zzy6 = zzhh.zzy(i46);
                            zzh = zzy6 + zzy5;
                            i19 += zzh;
                            i18 += 3;
                            i22 = 0;
                            i20 = 1048575;
                            i17 = i11;
                            i21 = i12;
                        } else {
                            zzz = zzhh.zzx((String) object2);
                            zzy3 = zzhh.zzy(i46);
                            zzh = zzy3 + zzz;
                            i19 += zzh;
                            i18 += 3;
                            i22 = 0;
                            i20 = 1048575;
                            i17 = i11;
                            i21 = i12;
                        }
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 60:
                    if (zzR(obj, i23, i18)) {
                        zzh = zzkt.zzh(i23, unsafe.getObject(obj, j4), zzx(i18));
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 61:
                    if (zzR(obj, i23, i18)) {
                        zzgw zzgwVar2 = (zzgw) unsafe.getObject(obj, j4);
                        int i48 = zzhh.zzb;
                        int zzd7 = zzgwVar2.zzd();
                        zzy5 = zzhh.zzy(zzd7) + zzd7;
                        zzy6 = zzhh.zzy(i23 << 3);
                        zzh = zzy6 + zzy5;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 62:
                    if (zzR(obj, i23, i18)) {
                        zzz = zzhh.zzy(zzp(obj, j4));
                        zzy3 = zzhh.zzy(i23 << 3);
                        zzh = zzy3 + zzz;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 63:
                    if (zzR(obj, i23, i18)) {
                        zzz = zzhh.zzu(zzp(obj, j4));
                        zzy3 = zzhh.zzy(i23 << 3);
                        zzh = zzy3 + zzz;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 64:
                    if (zzR(obj, i23, i18)) {
                        zzy2 = zzhh.zzy(i23 << 3);
                        zzh = zzy2 + 4;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 65:
                    if (zzR(obj, i23, i18)) {
                        zzy = zzhh.zzy(i23 << 3);
                        zzh = zzy + 8;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 66:
                    if (zzR(obj, i23, i18)) {
                        int zzp = zzp(obj, j4);
                        zzy7 = zzhh.zzy(i23 << 3);
                        zzy8 = zzhh.zzy((zzp >> 31) ^ (zzp + zzp));
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 67:
                    if (zzR(obj, i23, i18)) {
                        long zzv = zzv(obj, j4);
                        zzy7 = zzhh.zzy(i23 << 3);
                        zzy8 = zzhh.zzz((zzv >> 63) ^ (zzv + zzv));
                        i19 = zzy8 + zzy7 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 68:
                    if (zzR(obj, i23, i18)) {
                        zzh = zzhh.zzt(i23, (zzke) unsafe.getObject(obj, j4), zzx(i18));
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                default:
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
            }
        }
        zzll zzllVar = this.zzn;
        int zza3 = i19 + zzllVar.zza(zzllVar.zzd(obj));
        if (this.zzh) {
            zzij zzb2 = this.zzo.zzb(obj);
            int i49 = 0;
            for (int i50 = 0; i50 < zzb2.zza.zzb(); i50++) {
                Map.Entry zzg = zzb2.zza.zzg(i50);
                i49 += zzij.zza((zzii) zzg.getKey(), zzg.getValue());
            }
            for (Map.Entry entry2 : zzb2.zza.zzc()) {
                i49 += zzij.zza((zzii) entry2.getKey(), entry2.getValue());
            }
            return zza3 + i49;
        }
        return zza3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final int zzb(Object obj) {
        int i10;
        long doubleToLongBits;
        int i11;
        int floatToIntBits;
        int zzc;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int zzu = zzu(i14);
            int[] iArr = this.zzc;
            int i15 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i16 = iArr[i14];
            long j4 = i15;
            int i17 = 37;
            switch (zzt) {
                case 0:
                    i10 = i13 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzlv.zza(obj, j4));
                    byte[] bArr = zzjc.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzc;
                    break;
                case 1:
                    i11 = i13 * 53;
                    floatToIntBits = Float.floatToIntBits(zzlv.zzb(obj, j4));
                    i13 = floatToIntBits + i11;
                    break;
                case 2:
                    i10 = i13 * 53;
                    doubleToLongBits = zzlv.zzd(obj, j4);
                    byte[] bArr2 = zzjc.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzc;
                    break;
                case 3:
                    i10 = i13 * 53;
                    doubleToLongBits = zzlv.zzd(obj, j4);
                    byte[] bArr3 = zzjc.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzc;
                    break;
                case 4:
                    i10 = i13 * 53;
                    zzc = zzlv.zzc(obj, j4);
                    i13 = i10 + zzc;
                    break;
                case 5:
                    i10 = i13 * 53;
                    doubleToLongBits = zzlv.zzd(obj, j4);
                    byte[] bArr4 = zzjc.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzc;
                    break;
                case 6:
                    i10 = i13 * 53;
                    zzc = zzlv.zzc(obj, j4);
                    i13 = i10 + zzc;
                    break;
                case zzaja.zze.zzg /* 7 */:
                    i11 = i13 * 53;
                    floatToIntBits = zzjc.zza(zzlv.zzw(obj, j4));
                    i13 = floatToIntBits + i11;
                    break;
                case 8:
                    i11 = i13 * 53;
                    floatToIntBits = ((String) zzlv.zzf(obj, j4)).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case 9:
                    i12 = i13 * 53;
                    Object zzf = zzlv.zzf(obj, j4);
                    if (zzf != null) {
                        i17 = zzf.hashCode();
                    }
                    i13 = i12 + i17;
                    break;
                case 10:
                    i11 = i13 * 53;
                    floatToIntBits = zzlv.zzf(obj, j4).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    i10 = i13 * 53;
                    zzc = zzlv.zzc(obj, j4);
                    i13 = i10 + zzc;
                    break;
                case 12:
                    i10 = i13 * 53;
                    zzc = zzlv.zzc(obj, j4);
                    i13 = i10 + zzc;
                    break;
                case 13:
                    i10 = i13 * 53;
                    zzc = zzlv.zzc(obj, j4);
                    i13 = i10 + zzc;
                    break;
                case 14:
                    i10 = i13 * 53;
                    doubleToLongBits = zzlv.zzd(obj, j4);
                    byte[] bArr5 = zzjc.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzc;
                    break;
                case 15:
                    i10 = i13 * 53;
                    zzc = zzlv.zzc(obj, j4);
                    i13 = i10 + zzc;
                    break;
                case 16:
                    i10 = i13 * 53;
                    doubleToLongBits = zzlv.zzd(obj, j4);
                    byte[] bArr6 = zzjc.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzc;
                    break;
                case 17:
                    i12 = i13 * 53;
                    Object zzf2 = zzlv.zzf(obj, j4);
                    if (zzf2 != null) {
                        i17 = zzf2.hashCode();
                    }
                    i13 = i12 + i17;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i13 * 53;
                    floatToIntBits = zzlv.zzf(obj, j4).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    i11 = i13 * 53;
                    floatToIntBits = zzlv.zzf(obj, j4).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case 51:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j4));
                        byte[] bArr7 = zzjc.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j4));
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j4);
                        byte[] bArr8 = zzjc.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j4);
                        byte[] bArr9 = zzjc.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzc = zzp(obj, j4);
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j4);
                        byte[] bArr10 = zzjc.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzc = zzp(obj, j4);
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzjc.zza(zzS(obj, j4));
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = ((String) zzlv.zzf(obj, j4)).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzlv.zzf(obj, j4).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzlv.zzf(obj, j4).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzc = zzp(obj, j4);
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzc = zzp(obj, j4);
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzc = zzp(obj, j4);
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j4);
                        byte[] bArr11 = zzjc.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzc = zzp(obj, j4);
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j4);
                        byte[] bArr12 = zzjc.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzlv.zzf(obj, j4).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzd(obj).hashCode() + (i13 * 53);
        if (this.zzh) {
            return (hashCode * 53) + this.zzo.zzb(obj).zza.hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0c69, code lost:
    
        if (r5 == 1048575) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0c6b, code lost:
    
        r30.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0c71, code lost:
    
        r10 = r12.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0c76, code lost:
    
        if (r10 >= r12.zzl) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0c78, code lost:
    
        zzy(r33, r12.zzj[r10], null, r12.zzn, r33);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0c8b, code lost:
    
        if (r9 != 0) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0c8f, code lost:
    
        if (r6 != r36) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0c96, code lost:
    
        throw com.google.android.recaptcha.internal.zzje.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0c9d, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0c99, code lost:
    
        if (r6 > r36) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0c9b, code lost:
    
        if (r8 != r9) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0ca2, code lost:
    
        throw com.google.android.recaptcha.internal.zzje.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x03e7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:431:0x092c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:530:0x00ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:82:0x0b8e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:0x08b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x08ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.recaptcha.internal.zzgj r38) {
        /*
            Method dump skipped, instructions count: 3420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzgj):int");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final Object zze() {
        return ((zzit) this.zzg).zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzit) {
                zzit zzitVar = (zzit) obj;
                zzitVar.zzE(f.API_PRIORITY_OTHER);
                zzitVar.zza = 0;
                zzitVar.zzC();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int zzu = zzu(i10);
                int i11 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j4 = i11;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzm.zzb(obj, j4);
                                break;
                            case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    ((zzjy) object).zzc();
                                    unsafe.putObject(obj, j4, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i10], i10)) {
                        zzx(i10).zzf(zzb.getObject(obj, j4));
                    }
                }
                if (zzN(obj, i10)) {
                    zzx(i10).zzf(zzb.getObject(obj, j4));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zzf(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            int i11 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i12 = iArr[i10];
            long j4 = i11;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzlv.zzo(obj, j4, zzlv.zza(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzlv.zzp(obj, j4, zzlv.zzb(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j4, zzlv.zzd(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j4, zzlv.zzd(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j4, zzlv.zzc(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j4, zzlv.zzd(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j4, zzlv.zzc(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case zzaja.zze.zzg /* 7 */:
                    if (zzN(obj2, i10)) {
                        zzlv.zzm(obj, j4, zzlv.zzw(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i10)) {
                        zzlv.zzs(obj, j4, zzlv.zzf(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (zzN(obj2, i10)) {
                        zzlv.zzs(obj, j4, zzlv.zzf(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j4, zzlv.zzc(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j4, zzlv.zzc(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j4, zzlv.zzc(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j4, zzlv.zzd(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i10)) {
                        zzlv.zzq(obj, j4, zzlv.zzc(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i10)) {
                        zzlv.zzr(obj, j4, zzlv.zzd(obj2, j4));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzc(obj, obj2, j4);
                    break;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    int i13 = zzkt.zza;
                    zzlv.zzs(obj, j4, zzjz.zzb(zzlv.zzf(obj, j4), zzlv.zzf(obj2, j4)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i12, i10)) {
                        zzlv.zzs(obj, j4, zzlv.zzf(obj2, j4));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i12, i10)) {
                        zzlv.zzs(obj, j4, zzlv.zzf(obj2, j4));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i10);
                    break;
            }
        }
        zzkt.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzkt.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x00c5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0649 A[LOOP:3: B:50:0x0645->B:52:0x0649, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x065d  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r18, com.google.android.recaptcha.internal.zzkq r19, com.google.android.recaptcha.internal.zzie r20) {
        /*
            Method dump skipped, instructions count: 1776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzkq, com.google.android.recaptcha.internal.zzie):void");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgj zzgjVar) {
        zzc(obj, bArr, i10, i11, 0, zzgjVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0093. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.Object r24, com.google.android.recaptcha.internal.zzmd r25) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzmd):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c3 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzk(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i15 = iArr[i13];
            int i16 = iArr2[i15];
            int zzu = zzu(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = zzb.getInt(obj, i18);
                }
                i11 = i12;
                i10 = i18;
            } else {
                i10 = i14;
                i11 = i12;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt != 60 && zzt != 68) {
                        if (zzt != 49) {
                            if (zzt == 50 && !((zzjy) zzlv.zzf(obj, zzu & 1048575)).isEmpty()) {
                                throw null;
                            }
                        }
                    } else if (zzR(obj, i16, i15) && !zzP(obj, zzu, zzx(i15))) {
                        return false;
                    }
                }
                List list = (List) zzlv.zzf(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzkr zzx = zzx(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzx.zzl(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i15, i10, i11, i19) && !zzP(obj, zzu, zzx(i15))) {
                return false;
            }
            i13++;
            i14 = i10;
            i12 = i11;
        }
        if (this.zzh && !this.zzo.zzb(obj).zzk()) {
            return false;
        }
        return true;
    }
}
