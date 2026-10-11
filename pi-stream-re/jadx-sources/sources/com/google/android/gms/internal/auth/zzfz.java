package com.google.android.gms.internal.auth;

import androidx.media3.exoplayer.DefaultRenderersFactory;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i10, int i11, zzfw zzfwVar, boolean z9, boolean z10, int[] iArr2, int i12, int i13, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzh = z9;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
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

    private final void zzB(Object obj, Object obj2, int i10) {
        long zzv = zzv(i10) & 1048575;
        if (!zzG(obj2, i10)) {
            return;
        }
        Object zzf = zzhi.zzf(obj, zzv);
        Object zzf2 = zzhi.zzf(obj2, zzv);
        if (zzf != null && zzf2 != null) {
            zzhi.zzp(obj, zzv, zzez.zzg(zzf, zzf2));
            zzD(obj, i10);
        } else if (zzf2 != null) {
            zzhi.zzp(obj, zzv, zzf2);
            zzD(obj, i10);
        }
    }

    private final void zzC(Object obj, Object obj2, int i10) {
        Object obj3;
        int zzv = zzv(i10);
        int i11 = this.zzc[i10];
        long j4 = zzv & 1048575;
        if (!zzJ(obj2, i11, i10)) {
            return;
        }
        if (zzJ(obj, i11, i10)) {
            obj3 = zzhi.zzf(obj, j4);
        } else {
            obj3 = null;
        }
        Object zzf = zzhi.zzf(obj2, j4);
        if (obj3 != null && zzf != null) {
            zzhi.zzp(obj, j4, zzez.zzg(obj3, zzf));
            zzE(obj, i11, i10);
        } else if (zzf != null) {
            zzhi.zzp(obj, j4, zzf);
            zzE(obj, i11, i10);
        }
    }

    private final void zzD(Object obj, int i10) {
        int zzs = zzs(i10);
        long j4 = 1048575 & zzs;
        if (j4 == 1048575) {
            return;
        }
        zzhi.zzn(obj, j4, (1 << (zzs >>> 20)) | zzhi.zzc(obj, j4));
    }

    private final void zzE(Object obj, int i10, int i11) {
        zzhi.zzn(obj, zzs(i11) & 1048575, i10);
    }

    private final boolean zzF(Object obj, Object obj2, int i10) {
        if (zzG(obj, i10) == zzG(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean zzG(Object obj, int i10) {
        int zzs = zzs(i10);
        long j4 = zzs & 1048575;
        if (j4 == 1048575) {
            int zzv = zzv(i10);
            long j10 = zzv & 1048575;
            switch (zzu(zzv)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzhi.zza(obj, j10)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzhi.zzb(obj, j10)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzhi.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzhi.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzhi.zzc(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzhi.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzhi.zzc(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case zzaja.zze.zzg /* 7 */:
                    return zzhi.zzt(obj, j10);
                case 8:
                    Object zzf = zzhi.zzf(obj, j10);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (zzf instanceof zzee) {
                        if (zzee.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzhi.zzf(obj, j10) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzee.zzb.equals(zzhi.zzf(obj, j10))) {
                        return false;
                    }
                    return true;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzhi.zzc(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzhi.zzc(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzhi.zzc(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzhi.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzhi.zzc(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzhi.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzhi.zzf(obj, j10) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzhi.zzc(obj, j4) & (1 << (zzs >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzH(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzG(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzI(Object obj, int i10, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i10 & 1048575));
    }

    private final boolean zzJ(Object obj, int i10, int i11) {
        if (zzhi.zzc(obj, zzs(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    public static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar == zzgz.zza()) {
            zzgz zzc = zzgz.zzc();
            zzeuVar.zzc = zzc;
            return zzc;
        }
        return zzgzVar;
    }

    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.auth.zzfz zzk(com.google.android.gms.internal.auth.zzgg r33, com.google.android.gms.internal.auth.zzgb r34, com.google.android.gms.internal.auth.zzfk r35, com.google.android.gms.internal.auth.zzgy r36, com.google.android.gms.internal.auth.zzel r37, com.google.android.gms.internal.auth.zzfr r38) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzk(com.google.android.gms.internal.auth.zzgg, com.google.android.gms.internal.auth.zzgb, com.google.android.gms.internal.auth.zzfk, com.google.android.gms.internal.auth.zzgy, com.google.android.gms.internal.auth.zzel, com.google.android.gms.internal.auth.zzfr):com.google.android.gms.internal.auth.zzfz");
    }

    private static int zzl(Object obj, long j4) {
        return ((Integer) zzhi.zzf(obj, j4)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i10, int i11, int i12, long j4, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        Object zzz = zzz(i12);
        Object object = unsafe.getObject(obj, j4);
        if (!((zzfq) object).zze()) {
            zzfq zzb2 = zzfq.zza().zzb();
            zzfr.zza(zzb2, object);
            unsafe.putObject(obj, j4, zzb2);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    private final int zzn(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j4, int i17, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        long j10 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j4, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i10))));
                    unsafe.putInt(obj, j10, i13);
                    return i10 + 8;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j4, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i10))));
                    unsafe.putInt(obj, j10, i13);
                    return i10 + 4;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzdt.zzm(bArr, i10, zzdsVar);
                    unsafe.putObject(obj, j4, Long.valueOf(zzdsVar.zzb));
                    unsafe.putInt(obj, j10, i13);
                    return zzm;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzdt.zzj(bArr, i10, zzdsVar);
                    unsafe.putObject(obj, j4, Integer.valueOf(zzdsVar.zza));
                    unsafe.putInt(obj, j10, i13);
                    return zzj;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j4, Long.valueOf(zzdt.zzn(bArr, i10)));
                    unsafe.putInt(obj, j10, i13);
                    return i10 + 8;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j4, Integer.valueOf(zzdt.zzb(bArr, i10)));
                    unsafe.putInt(obj, j10, i13);
                    return i10 + 4;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzdt.zzm(bArr, i10, zzdsVar);
                    unsafe.putObject(obj, j4, Boolean.valueOf(zzdsVar.zzb != 0));
                    unsafe.putInt(obj, j10, i13);
                    return zzm2;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i18 = zzdsVar.zza;
                    if (i18 == 0) {
                        unsafe.putObject(obj, j4, "");
                    } else {
                        if ((i15 & 536870912) != 0 && !zzhm.zzd(bArr, zzj2, zzj2 + i18)) {
                            throw zzfa.zzb();
                        }
                        unsafe.putObject(obj, j4, new String(bArr, zzj2, i18, zzez.zzb));
                        zzj2 += i18;
                    }
                    unsafe.putInt(obj, j10, i13);
                    return zzj2;
                }
                return i10;
            case 60:
                if (i14 == 2) {
                    int zzd = zzdt.zzd(zzy(i17), bArr, i10, i11, zzdsVar);
                    Object object = unsafe.getInt(obj, j10) == i13 ? unsafe.getObject(obj, j4) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j4, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j4, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j10, i13);
                    return zzd;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzdt.zza(bArr, i10, zzdsVar);
                    unsafe.putObject(obj, j4, zzdsVar.zzc);
                    unsafe.putInt(obj, j10, i13);
                    return zza2;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzdt.zzj(bArr, i10, zzdsVar);
                    int i19 = zzdsVar.zza;
                    zzex zzx = zzx(i17);
                    if (zzx != null && !zzx.zza()) {
                        zzc(obj).zzf(i12, Long.valueOf(i19));
                    } else {
                        unsafe.putObject(obj, j4, Integer.valueOf(i19));
                        unsafe.putInt(obj, j10, i13);
                    }
                    return zzj3;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    int zzj4 = zzdt.zzj(bArr, i10, zzdsVar);
                    unsafe.putObject(obj, j4, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                    unsafe.putInt(obj, j10, i13);
                    return zzj4;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzdt.zzm(bArr, i10, zzdsVar);
                    unsafe.putObject(obj, j4, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                    unsafe.putInt(obj, j10, i13);
                    return zzm3;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    int zzc = zzdt.zzc(zzy(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzdsVar);
                    Object object2 = unsafe.getInt(obj, j10) == i13 ? unsafe.getObject(obj, j4) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j4, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j4, zzez.zzg(object2, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j10, i13);
                    return zzc;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0080. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    private final int zzo(Object obj, byte[] bArr, int i10, int i11, zzds zzdsVar) {
        byte b10;
        int i12;
        int zzq;
        int i13;
        int i14;
        int i15;
        Unsafe unsafe;
        int i16;
        int i17;
        int i18;
        int i19;
        int zzm;
        boolean z9;
        int zzd;
        int i20;
        int i21;
        int i22;
        int i23;
        zzfz<T> zzfzVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i24 = i11;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i25 = 1048575;
        int i26 = -1;
        int i27 = i10;
        int i28 = -1;
        int i29 = 1048575;
        int i30 = 0;
        int i31 = 0;
        while (i27 < i24) {
            int i32 = i27 + 1;
            byte b11 = bArr2[i27];
            if (b11 < 0) {
                i12 = zzdt.zzk(b11, bArr2, i32, zzdsVar2);
                b10 = zzdsVar2.zza;
            } else {
                b10 = b11;
                i12 = i32;
            }
            int i33 = b10 >>> 3;
            int i34 = b10 & 7;
            if (i33 > i28) {
                zzq = zzfzVar.zzr(i33, i30 / 3);
            } else {
                zzq = zzfzVar.zzq(i33);
            }
            int i35 = zzq;
            if (i35 == i26) {
                i13 = i12;
                i14 = i33;
                i15 = i26;
                unsafe = unsafe2;
                i16 = 0;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i36 = iArr[i35 + 1];
                int zzu = zzu(i36);
                long j4 = i36 & i25;
                if (zzu <= 17) {
                    int i37 = iArr[i35 + 2];
                    int i38 = 1 << (i37 >>> 20);
                    int i39 = i37 & 1048575;
                    if (i39 != i29) {
                        if (i29 != 1048575) {
                            unsafe2.putInt(obj2, i29, i31);
                        }
                        if (i39 != 1048575) {
                            i31 = unsafe2.getInt(obj2, i39);
                        }
                        i29 = i39;
                    }
                    switch (zzu) {
                        case 0:
                            zzdsVar2 = zzdsVar;
                            i17 = i35;
                            i18 = i12;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 == 1) {
                                zzhi.zzl(obj2, j4, Double.longBitsToDouble(zzdt.zzn(bArr2, i18)));
                                i27 = i18 + 8;
                                i31 |= i38;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            } else {
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                                break;
                            }
                        case 1:
                            zzdsVar2 = zzdsVar;
                            i17 = i35;
                            i18 = i12;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 == 5) {
                                zzhi.zzm(obj2, j4, Float.intBitsToFloat(zzdt.zzb(bArr2, i18)));
                                i27 = i18 + 4;
                                i31 |= i38;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            } else {
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzdsVar2 = zzdsVar;
                            i17 = i35;
                            i18 = i12;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 == 0) {
                                zzm = zzdt.zzm(bArr2, i18, zzdsVar2);
                                unsafe2.putLong(obj, j4, zzdsVar2.zzb);
                                i31 |= i38;
                                i27 = zzm;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            } else {
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                                break;
                            }
                        case 4:
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            zzdsVar2 = zzdsVar;
                            i17 = i35;
                            i18 = i12;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 == 0) {
                                i27 = zzdt.zzj(bArr2, i18, zzdsVar2);
                                unsafe2.putInt(obj2, j4, zzdsVar2.zza);
                                i31 |= i38;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            } else {
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            zzdsVar2 = zzdsVar;
                            i17 = i35;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 == 1) {
                                i18 = i12;
                                unsafe2.putLong(obj, j4, zzdt.zzn(bArr2, i12));
                                i27 = i18 + 8;
                                i31 |= i38;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            } else {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            zzdsVar2 = zzdsVar;
                            i17 = i35;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 == 5) {
                                unsafe2.putInt(obj2, j4, zzdt.zzb(bArr2, i12));
                                i27 = i12 + 4;
                                i31 |= i38;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            } else {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                                break;
                            }
                        case zzaja.zze.zzg /* 7 */:
                            zzdsVar2 = zzdsVar;
                            i17 = i35;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 == 0) {
                                i27 = zzdt.zzm(bArr2, i12, zzdsVar2);
                                if (zzdsVar2.zzb != 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                zzhi.zzk(obj2, j4, z9);
                                i31 |= i38;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            } else {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                                break;
                            }
                        case 8:
                            zzdsVar2 = zzdsVar;
                            i17 = i35;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 == 2) {
                                if ((536870912 & i36) == 0) {
                                    i27 = zzdt.zzg(bArr2, i12, zzdsVar2);
                                } else {
                                    i27 = zzdt.zzh(bArr2, i12, zzdsVar2);
                                }
                                unsafe2.putObject(obj2, j4, zzdsVar2.zzc);
                                i31 |= i38;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            } else {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                                break;
                            }
                        case 9:
                            zzdsVar2 = zzdsVar;
                            i17 = i35;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 == 2) {
                                zzd = zzdt.zzd(zzfzVar.zzy(i17), bArr2, i12, i24, zzdsVar2);
                                Object object = unsafe2.getObject(obj2, j4);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j4, zzdsVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j4, zzez.zzg(object, zzdsVar2.zzc));
                                }
                                i31 |= i38;
                                i27 = zzd;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            } else {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                                break;
                            }
                        case 10:
                            zzdsVar2 = zzdsVar;
                            i17 = i35;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 == 2) {
                                zzd = zzdt.zza(bArr2, i12, zzdsVar2);
                                unsafe2.putObject(obj2, j4, zzdsVar2.zzc);
                                i31 |= i38;
                                i27 = zzd;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            } else {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                                break;
                            }
                        case 12:
                            zzdsVar2 = zzdsVar;
                            i17 = i35;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 == 0) {
                                zzd = zzdt.zzj(bArr2, i12, zzdsVar2);
                                unsafe2.putInt(obj2, j4, zzdsVar2.zza);
                                i31 |= i38;
                                i27 = zzd;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            } else {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                                break;
                            }
                        case 15:
                            zzdsVar2 = zzdsVar;
                            i17 = i35;
                            i19 = 1048575;
                            i14 = i33;
                            if (i34 == 0) {
                                zzd = zzdt.zzj(bArr2, i12, zzdsVar2);
                                unsafe2.putInt(obj2, j4, zzei.zzb(zzdsVar2.zza));
                                i31 |= i38;
                                i27 = zzd;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            } else {
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                                break;
                            }
                        case 16:
                            if (i34 == 0) {
                                zzdsVar2 = zzdsVar;
                                zzm = zzdt.zzm(bArr2, i12, zzdsVar2);
                                i17 = i35;
                                i14 = i33;
                                i19 = 1048575;
                                unsafe2.putLong(obj, j4, zzei.zzc(zzdsVar2.zzb));
                                i31 |= i38;
                                i27 = zzm;
                                i30 = i17;
                                i28 = i14;
                                i25 = i19;
                                i26 = -1;
                                break;
                            } else {
                                i14 = i33;
                                i17 = i35;
                                i18 = i12;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                                break;
                            }
                        default:
                            i14 = i33;
                            i17 = i35;
                            i18 = i12;
                            i13 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            i15 = -1;
                            break;
                    }
                } else {
                    zzdsVar2 = zzdsVar;
                    i17 = i35;
                    int i40 = i12;
                    i19 = 1048575;
                    i14 = i33;
                    if (zzu == 27) {
                        if (i34 == 2) {
                            zzey zzeyVar = (zzey) unsafe2.getObject(obj2, j4);
                            if (!zzeyVar.zzc()) {
                                int size = zzeyVar.size();
                                if (size == 0) {
                                    i23 = 10;
                                } else {
                                    i23 = size + size;
                                }
                                zzeyVar = zzeyVar.zzd(i23);
                                unsafe2.putObject(obj2, j4, zzeyVar);
                            }
                            i27 = zzdt.zze(zzfzVar.zzy(i17), b10, bArr, i40, i11, zzeyVar, zzdsVar);
                            i31 = i31;
                            i30 = i17;
                            i28 = i14;
                            i25 = i19;
                            i26 = -1;
                        } else {
                            i20 = i40;
                            i21 = i31;
                            i22 = i29;
                            unsafe = unsafe2;
                            i16 = i17;
                            i15 = -1;
                        }
                    } else if (zzu <= 49) {
                        i21 = i31;
                        i22 = i29;
                        i15 = -1;
                        unsafe = unsafe2;
                        i16 = i17;
                        i27 = zzp(obj, bArr, i40, i11, b10, i14, i34, i17, i36, zzu, j4, zzdsVar);
                        if (i27 != i40) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i24 = i11;
                            zzdsVar2 = zzdsVar;
                            i29 = i22;
                            i26 = i15;
                            i28 = i14;
                            i31 = i21;
                            i30 = i16;
                            unsafe2 = unsafe;
                            i25 = 1048575;
                            zzfzVar = this;
                        } else {
                            i13 = i27;
                            i29 = i22;
                            i31 = i21;
                        }
                    } else {
                        i20 = i40;
                        i21 = i31;
                        i22 = i29;
                        unsafe = unsafe2;
                        i16 = i17;
                        i15 = -1;
                        if (zzu == 50) {
                            if (i34 == 2) {
                                i27 = zzm(obj, bArr, i20, i11, i16, j4, zzdsVar);
                                if (i27 != i20) {
                                    obj2 = obj;
                                    bArr2 = bArr;
                                    i24 = i11;
                                    zzdsVar2 = zzdsVar;
                                    i29 = i22;
                                    i26 = i15;
                                    i28 = i14;
                                    i31 = i21;
                                    i30 = i16;
                                    unsafe2 = unsafe;
                                    i25 = 1048575;
                                    zzfzVar = this;
                                } else {
                                    i13 = i27;
                                    i29 = i22;
                                    i31 = i21;
                                }
                            }
                        } else {
                            i27 = zzn(obj, bArr, i20, i11, b10, i14, i34, i36, zzu, j4, i16, zzdsVar);
                            if (i27 != i20) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i24 = i11;
                                zzdsVar2 = zzdsVar;
                                i29 = i22;
                                i26 = i15;
                                i28 = i14;
                                i31 = i21;
                                i30 = i16;
                                unsafe2 = unsafe;
                                i25 = 1048575;
                                zzfzVar = this;
                            } else {
                                i13 = i27;
                                i29 = i22;
                                i31 = i21;
                            }
                        }
                    }
                    i13 = i20;
                    i29 = i22;
                    i31 = i21;
                }
            }
            i27 = zzdt.zzi(b10, bArr, i13, i11, zzc(obj), zzdsVar);
            zzfzVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i24 = i11;
            zzdsVar2 = zzdsVar;
            i26 = i15;
            i28 = i14;
            i30 = i16;
            unsafe2 = unsafe;
            i25 = 1048575;
        }
        int i41 = i31;
        int i42 = i29;
        Unsafe unsafe3 = unsafe2;
        if (i42 != i25) {
            unsafe3.putInt(obj, i42, i41);
        }
        if (i27 == i11) {
            return i27;
        }
        throw zzfa.zzd();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0037. Please report as an issue. */
    private final int zzp(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j4, int i16, long j10, zzds zzdsVar) {
        int i17;
        int i18;
        int i19;
        int i20;
        int zzj;
        int i21 = i10;
        Unsafe unsafe = zzb;
        zzey zzeyVar = (zzey) unsafe.getObject(obj, j10);
        if (!zzeyVar.zzc()) {
            int size = zzeyVar.size();
            zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j10, zzeyVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    zzej zzejVar = (zzej) zzeyVar;
                    int zzj2 = zzdt.zzj(bArr, i21, zzdsVar);
                    int i22 = zzdsVar.zza + zzj2;
                    while (zzj2 < i22) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i22) {
                        return zzj2;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVar;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i10)));
                    while (true) {
                        i17 = i21 + 8;
                        if (i17 < i11) {
                            i21 = zzdt.zzj(bArr, i17, zzdsVar);
                            if (i12 == zzdsVar.zza) {
                                zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i21)));
                            }
                        }
                    }
                    return i17;
                }
                return i21;
            case 19:
            case 36:
                if (i14 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVar;
                    int zzj3 = zzdt.zzj(bArr, i21, zzdsVar);
                    int i23 = zzdsVar.zza + zzj3;
                    while (zzj3 < i23) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i23) {
                        return zzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVar;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i10)));
                    while (true) {
                        i18 = i21 + 4;
                        if (i18 < i11) {
                            i21 = zzdt.zzj(bArr, i18, zzdsVar);
                            if (i12 == zzdsVar.zza) {
                                zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i21)));
                            }
                        }
                    }
                    return i18;
                }
                return i21;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVar;
                    int zzj4 = zzdt.zzj(bArr, i21, zzdsVar);
                    int i24 = zzdsVar.zza + zzj4;
                    while (zzj4 < i24) {
                        zzj4 = zzdt.zzm(bArr, zzj4, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (zzj4 == i24) {
                        return zzj4;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVar;
                    int zzm = zzdt.zzm(bArr, i21, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (zzm < i11) {
                        int zzj5 = zzdt.zzj(bArr, zzm, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return zzm;
                        }
                        zzm = zzdt.zzm(bArr, zzj5, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return zzm;
                }
                return i21;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return zzdt.zzf(bArr, i21, zzeyVar, zzdsVar);
                }
                if (i14 == 0) {
                    return zzdt.zzl(i12, bArr, i10, i11, zzeyVar, zzdsVar);
                }
                return i21;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVar;
                    int zzj6 = zzdt.zzj(bArr, i21, zzdsVar);
                    int i25 = zzdsVar.zza + zzj6;
                    while (zzj6 < i25) {
                        zzflVar3.zze(zzdt.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i25) {
                        return zzj6;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVar;
                    zzflVar4.zze(zzdt.zzn(bArr, i10));
                    while (true) {
                        i19 = i21 + 8;
                        if (i19 < i11) {
                            i21 = zzdt.zzj(bArr, i19, zzdsVar);
                            if (i12 == zzdsVar.zza) {
                                zzflVar4.zze(zzdt.zzn(bArr, i21));
                            }
                        }
                    }
                    return i19;
                }
                return i21;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    zzev zzevVar = (zzev) zzeyVar;
                    int zzj7 = zzdt.zzj(bArr, i21, zzdsVar);
                    int i26 = zzdsVar.zza + zzj7;
                    while (zzj7 < i26) {
                        zzevVar.zze(zzdt.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i26) {
                        return zzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVar;
                    zzevVar2.zze(zzdt.zzb(bArr, i10));
                    while (true) {
                        i20 = i21 + 4;
                        if (i20 < i11) {
                            i21 = zzdt.zzj(bArr, i20, zzdsVar);
                            if (i12 == zzdsVar.zza) {
                                zzevVar2.zze(zzdt.zzb(bArr, i21));
                            }
                        }
                    }
                    return i20;
                }
                return i21;
            case 25:
            case 42:
                if (i14 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVar;
                    zzj = zzdt.zzj(bArr, i21, zzdsVar);
                    int i27 = zzdsVar.zza + zzj;
                    while (zzj < i27) {
                        zzj = zzdt.zzm(bArr, zzj, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (zzj != i27) {
                        throw zzfa.zzf();
                    }
                    return zzj;
                }
                if (i14 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVar;
                    int zzm2 = zzdt.zzm(bArr, i21, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (zzm2 < i11) {
                        int zzj8 = zzdt.zzj(bArr, zzm2, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzdt.zzm(bArr, zzj8, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i21;
            case 26:
                if (i14 == 2) {
                    if ((j4 & 536870912) == 0) {
                        int zzj9 = zzdt.zzj(bArr, i21, zzdsVar);
                        int i28 = zzdsVar.zza;
                        if (i28 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i28 == 0) {
                            zzeyVar.add("");
                        } else {
                            zzeyVar.add(new String(bArr, zzj9, i28, zzez.zzb));
                            zzj9 += i28;
                        }
                        while (zzj9 < i11) {
                            int zzj10 = zzdt.zzj(bArr, zzj9, zzdsVar);
                            if (i12 != zzdsVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzdt.zzj(bArr, zzj10, zzdsVar);
                            int i29 = zzdsVar.zza;
                            if (i29 < 0) {
                                throw zzfa.zzc();
                            }
                            if (i29 == 0) {
                                zzeyVar.add("");
                            } else {
                                zzeyVar.add(new String(bArr, zzj9, i29, zzez.zzb));
                                zzj9 += i29;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzdt.zzj(bArr, i21, zzdsVar);
                    int i30 = zzdsVar.zza;
                    if (i30 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i30 == 0) {
                        zzeyVar.add("");
                    } else {
                        int i31 = zzj11 + i30;
                        if (zzhm.zzd(bArr, zzj11, i31)) {
                            zzeyVar.add(new String(bArr, zzj11, i30, zzez.zzb));
                            zzj11 = i31;
                        } else {
                            throw zzfa.zzb();
                        }
                    }
                    while (zzj11 < i11) {
                        int zzj12 = zzdt.zzj(bArr, zzj11, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzdt.zzj(bArr, zzj12, zzdsVar);
                        int i32 = zzdsVar.zza;
                        if (i32 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i32 == 0) {
                            zzeyVar.add("");
                        } else {
                            int i33 = zzj11 + i32;
                            if (zzhm.zzd(bArr, zzj11, i33)) {
                                zzeyVar.add(new String(bArr, zzj11, i32, zzez.zzb));
                                zzj11 = i33;
                            } else {
                                throw zzfa.zzb();
                            }
                        }
                    }
                    return zzj11;
                }
                return i21;
            case 27:
                if (i14 == 2) {
                    return zzdt.zze(zzy(i15), i12, bArr, i10, i11, zzeyVar, zzdsVar);
                }
                return i21;
            case 28:
                if (i14 == 2) {
                    int zzj13 = zzdt.zzj(bArr, i21, zzdsVar);
                    int i34 = zzdsVar.zza;
                    if (i34 >= 0) {
                        if (i34 > bArr.length - zzj13) {
                            throw zzfa.zzf();
                        }
                        if (i34 == 0) {
                            zzeyVar.add(zzee.zzb);
                        } else {
                            zzeyVar.add(zzee.zzk(bArr, zzj13, i34));
                            zzj13 += i34;
                        }
                        while (zzj13 < i11) {
                            int zzj14 = zzdt.zzj(bArr, zzj13, zzdsVar);
                            if (i12 != zzdsVar.zza) {
                                return zzj13;
                            }
                            zzj13 = zzdt.zzj(bArr, zzj14, zzdsVar);
                            int i35 = zzdsVar.zza;
                            if (i35 >= 0) {
                                if (i35 > bArr.length - zzj13) {
                                    throw zzfa.zzf();
                                }
                                if (i35 == 0) {
                                    zzeyVar.add(zzee.zzb);
                                } else {
                                    zzeyVar.add(zzee.zzk(bArr, zzj13, i35));
                                    zzj13 += i35;
                                }
                            } else {
                                throw zzfa.zzc();
                            }
                        }
                        return zzj13;
                    }
                    throw zzfa.zzc();
                }
                return i21;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        zzj = zzdt.zzl(i12, bArr, i10, i11, zzeyVar, zzdsVar);
                    }
                    return i21;
                }
                zzj = zzdt.zzf(bArr, i21, zzeyVar, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object zzd = zzgj.zzd(i13, zzeyVar, zzx(i15), zzgzVar, this.zzm);
                if (zzd != null) {
                    zzeuVar.zzc = (zzgz) zzd;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i14 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVar;
                    int zzj15 = zzdt.zzj(bArr, i21, zzdsVar);
                    int i36 = zzdsVar.zza + zzj15;
                    while (zzj15 < i36) {
                        zzj15 = zzdt.zzj(bArr, zzj15, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (zzj15 == i36) {
                        return zzj15;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVar;
                    int zzj16 = zzdt.zzj(bArr, i21, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (zzj16 < i11) {
                        int zzj17 = zzdt.zzj(bArr, zzj16, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzdt.zzj(bArr, zzj17, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return zzj16;
                }
                return i21;
            case 34:
            case 48:
                if (i14 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVar;
                    int zzj18 = zzdt.zzj(bArr, i21, zzdsVar);
                    int i37 = zzdsVar.zza + zzj18;
                    while (zzj18 < i37) {
                        zzj18 = zzdt.zzm(bArr, zzj18, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (zzj18 == i37) {
                        return zzj18;
                    }
                    throw zzfa.zzf();
                }
                if (i14 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVar;
                    int zzm3 = zzdt.zzm(bArr, i21, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (zzm3 < i11) {
                        int zzj19 = zzdt.zzj(bArr, zzm3, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzdt.zzm(bArr, zzj19, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return zzm3;
                }
                return i21;
            default:
                if (i14 == 3) {
                    zzgh zzy = zzy(i15);
                    int i38 = (i12 & (-8)) | 4;
                    int zzc = zzdt.zzc(zzy, bArr, i10, i11, i38, zzdsVar);
                    zzeyVar.add(zzdsVar.zzc);
                    while (zzc < i11) {
                        int zzj20 = zzdt.zzj(bArr, zzc, zzdsVar);
                        if (i12 != zzdsVar.zza) {
                            return zzc;
                        }
                        zzc = zzdt.zzc(zzy, bArr, zzj20, i11, i38, zzdsVar);
                        zzeyVar.add(zzdsVar.zzc);
                    }
                    return zzc;
                }
                return i21;
        }
    }

    private final int zzq(int i10) {
        if (i10 >= this.zze && i10 <= this.zzf) {
            return zzt(i10, 0);
        }
        return -1;
    }

    private final int zzr(int i10, int i11) {
        if (i10 >= this.zze && i10 <= this.zzf) {
            return zzt(i10, i11);
        }
        return -1;
    }

    private final int zzs(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzt(int i10, int i11) {
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

    private static int zzu(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzv(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzw(Object obj, long j4) {
        return ((Long) zzhi.zzf(obj, j4)).longValue();
    }

    private final zzex zzx(int i10) {
        int i11 = i10 / 3;
        return (zzex) this.zzd[i11 + i11 + 1];
    }

    private final zzgh zzy(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgh zzghVar = (zzgh) this.zzd[i12];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzb2 = zzge.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i10;
        int zzc;
        int i11;
        int zzc2;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int zzv = zzv(i13);
            int i14 = this.zzc[i13];
            long j4 = 1048575 & zzv;
            int i15 = 37;
            switch (zzu(zzv)) {
                case 0:
                    i10 = i12 * 53;
                    zzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j4)));
                    i12 = zzc + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    zzc = Float.floatToIntBits(zzhi.zzb(obj, j4));
                    i12 = zzc + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i12 = zzc + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i12 = zzc + i10;
                    break;
                case 4:
                    i11 = i12 * 53;
                    zzc2 = zzhi.zzc(obj, j4);
                    i12 = i11 + zzc2;
                    break;
                case 5:
                    i10 = i12 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i12 = zzc + i10;
                    break;
                case 6:
                    i11 = i12 * 53;
                    zzc2 = zzhi.zzc(obj, j4);
                    i12 = i11 + zzc2;
                    break;
                case zzaja.zze.zzg /* 7 */:
                    i10 = i12 * 53;
                    zzc = zzez.zza(zzhi.zzt(obj, j4));
                    i12 = zzc + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    zzc = ((String) zzhi.zzf(obj, j4)).hashCode();
                    i12 = zzc + i10;
                    break;
                case 9:
                    Object zzf = zzhi.zzf(obj, j4);
                    if (zzf != null) {
                        i15 = zzf.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i10 = i12 * 53;
                    zzc = zzhi.zzf(obj, j4).hashCode();
                    i12 = zzc + i10;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    i11 = i12 * 53;
                    zzc2 = zzhi.zzc(obj, j4);
                    i12 = i11 + zzc2;
                    break;
                case 12:
                    i11 = i12 * 53;
                    zzc2 = zzhi.zzc(obj, j4);
                    i12 = i11 + zzc2;
                    break;
                case 13:
                    i11 = i12 * 53;
                    zzc2 = zzhi.zzc(obj, j4);
                    i12 = i11 + zzc2;
                    break;
                case 14:
                    i10 = i12 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i12 = zzc + i10;
                    break;
                case 15:
                    i11 = i12 * 53;
                    zzc2 = zzhi.zzc(obj, j4);
                    i12 = i11 + zzc2;
                    break;
                case 16:
                    i10 = i12 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i12 = zzc + i10;
                    break;
                case 17:
                    Object zzf2 = zzhi.zzf(obj, j4);
                    if (zzf2 != null) {
                        i15 = zzf2.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
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
                    i10 = i12 * 53;
                    zzc = zzhi.zzf(obj, j4).hashCode();
                    i12 = zzc + i10;
                    break;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    i10 = i12 * 53;
                    zzc = zzhi.zzf(obj, j4).hashCode();
                    i12 = zzc + i10;
                    break;
                case 51:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j4)).doubleValue()));
                        i12 = zzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j4)).floatValue());
                        i12 = zzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzez.zzc(zzw(obj, j4));
                        i12 = zzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzez.zzc(zzw(obj, j4));
                        i12 = zzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzJ(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc2 = zzl(obj, j4);
                        i12 = i11 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzez.zzc(zzw(obj, j4));
                        i12 = zzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzJ(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc2 = zzl(obj, j4);
                        i12 = i11 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzez.zza(((Boolean) zzhi.zzf(obj, j4)).booleanValue());
                        i12 = zzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = ((String) zzhi.zzf(obj, j4)).hashCode();
                        i12 = zzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzhi.zzf(obj, j4).hashCode();
                        i12 = zzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzhi.zzf(obj, j4).hashCode();
                        i12 = zzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzJ(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc2 = zzl(obj, j4);
                        i12 = i11 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzJ(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc2 = zzl(obj, j4);
                        i12 = i11 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzJ(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc2 = zzl(obj, j4);
                        i12 = i11 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzez.zzc(zzw(obj, j4));
                        i12 = zzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzJ(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zzc2 = zzl(obj, j4);
                        i12 = i11 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzez.zzc(zzw(obj, j4));
                        i12 = zzc + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zzc = zzhi.zzf(obj, j4).hashCode();
                        i12 = zzc + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this.zzm.zza(obj).hashCode() + (i12 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0335, code lost:
    
        if (r0 != r20) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0337, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r1 = r17;
        r2 = r19;
        r3 = r21;
        r5 = r22;
        r6 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x034f, code lost:
    
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0372, code lost:
    
        if (r0 != r15) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0398, code lost:
    
        if (r0 != r15) goto L115;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:93:0x008e. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.auth.zzds r35) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzds):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i10;
        int i11 = this.zzj;
        while (true) {
            i10 = this.zzk;
            if (i11 >= i10) {
                break;
            }
            long zzv = zzv(this.zzi[i11]) & 1048575;
            Object zzf = zzhi.zzf(obj, zzv);
            if (zzf != null) {
                ((zzfq) zzf).zzc();
                zzhi.zzp(obj, zzv, zzf);
            }
            i11++;
        }
        int length = this.zzi.length;
        while (i10 < length) {
            this.zzl.zza(obj, this.zzi[i10]);
            i10++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzv = zzv(i10);
            long j4 = 1048575 & zzv;
            int i11 = this.zzc[i10];
            switch (zzu(zzv)) {
                case 0:
                    if (zzG(obj2, i10)) {
                        zzhi.zzl(obj, j4, zzhi.zza(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(obj2, i10)) {
                        zzhi.zzm(obj, j4, zzhi.zzb(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case zzaja.zze.zzg /* 7 */:
                    if (zzG(obj2, i10)) {
                        zzhi.zzk(obj, j4, zzhi.zzt(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzG(obj2, i10)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i10);
                    break;
                case 10:
                    if (zzG(obj2, i10)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i10);
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
                    this.zzl.zzb(obj, obj2, j4);
                    break;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    zzgj.zzi(this.zzp, obj, obj2, j4);
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
                    if (zzJ(obj2, i11, i10)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzE(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzJ(obj2, i11, i10)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzE(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i10);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i10, int i11, zzds zzdsVar) {
        if (this.zzh) {
            zzo(obj, bArr, i10, i11, zzdsVar);
        } else {
            zzb(obj, bArr, i10, i11, 0, zzdsVar);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzh(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzh(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzi(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzj) {
            int i15 = this.zzi[i14];
            int i16 = this.zzc[i15];
            int zzv = zzv(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & zzv) != 0 && !zzH(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzu = zzu(zzv);
            if (zzu != 9 && zzu != 17) {
                if (zzu != 27) {
                    if (zzu != 60 && zzu != 68) {
                        if (zzu != 49) {
                            if (zzu == 50 && !((zzfq) zzhi.zzf(obj, zzv & 1048575)).isEmpty()) {
                                throw null;
                            }
                        }
                    } else if (zzJ(obj, i16, i15) && !zzI(obj, zzv, zzy(i15))) {
                        return false;
                    }
                }
                List list = (List) zzhi.zzf(obj, zzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgh zzy = zzy(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzy.zzi(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzH(obj, i15, i10, i11, i19) && !zzI(obj, zzv, zzy(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return true;
    }
}
