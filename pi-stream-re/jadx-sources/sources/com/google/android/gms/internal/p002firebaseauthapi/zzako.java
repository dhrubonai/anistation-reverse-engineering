package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.media3.exoplayer.DefaultRenderersFactory;
import com.google.android.gms.common.api.f;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzako<T> implements zzalc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzamh.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzakk zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final zzakz zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzaks zzo;
    private final zzajt zzp;
    private final zzamb<?, ?> zzq;
    private final zzair<?> zzr;
    private final zzakh zzs;

    private zzako(int[] iArr, Object[] objArr, int i10, int i11, zzakk zzakkVar, zzakz zzakzVar, boolean z9, int[] iArr2, int i12, int i13, zzaks zzaksVar, zzajt zzajtVar, zzamb<?, ?> zzambVar, zzair<?> zzairVar, zzakh zzakhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzakkVar instanceof zzaja;
        this.zzj = zzakzVar;
        this.zzh = zzairVar != null && zzairVar.zza(zzakkVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i12;
        this.zzn = i13;
        this.zzo = zzaksVar;
        this.zzp = zzajtVar;
        this.zzq = zzambVar;
        this.zzr = zzairVar;
        this.zzg = zzakkVar;
        this.zzs = zzakhVar;
    }

    private static <T> double zza(T t9, long j4) {
        return ((Double) zzamh.zze(t9, j4)).doubleValue();
    }

    private static <T> float zzb(T t9, long j4) {
        return ((Float) zzamh.zze(t9, j4)).floatValue();
    }

    private static <T> int zzc(T t9, long j4) {
        return ((Integer) zzamh.zze(t9, j4)).intValue();
    }

    private static <T> long zzd(T t9, long j4) {
        return ((Long) zzamh.zze(t9, j4)).longValue();
    }

    private final zzalc zze(int i10) {
        int i11 = (i10 / 3) << 1;
        zzalc zzalcVar = (zzalc) this.zzd[i11];
        if (zzalcVar != null) {
            return zzalcVar;
        }
        zzalc<T> zza2 = zzaky.zza().zza((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zza2;
        return zza2;
    }

    private final Object zzf(int i10) {
        return this.zzd[(i10 / 3) << 1];
    }

    private static boolean zzg(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private static int zza(byte[] bArr, int i10, int i11, zzamo zzamoVar, Class<?> cls, zzahl zzahlVar) {
        switch (zzakr.zza[zzamoVar.ordinal()]) {
            case 1:
                int zzd = zzahi.zzd(bArr, i10, zzahlVar);
                zzahlVar.zzc = Boolean.valueOf(zzahlVar.zzb != 0);
                return zzd;
            case 2:
                return zzahi.zza(bArr, i10, zzahlVar);
            case 3:
                zzahlVar.zzc = Double.valueOf(zzahi.zza(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                zzahlVar.zzc = Integer.valueOf(zzahi.zzc(bArr, i10));
                return i10 + 4;
            case 6:
            case zzaja.zze.zzg /* 7 */:
                zzahlVar.zzc = Long.valueOf(zzahi.zzd(bArr, i10));
                return i10 + 8;
            case 8:
                zzahlVar.zzc = Float.valueOf(zzahi.zzb(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                int zzc = zzahi.zzc(bArr, i10, zzahlVar);
                zzahlVar.zzc = Integer.valueOf(zzahlVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzahi.zzd(bArr, i10, zzahlVar);
                zzahlVar.zzc = Long.valueOf(zzahlVar.zzb);
                return zzd2;
            case 14:
                return zzahi.zza(zzaky.zza().zza((Class) cls), bArr, i10, i11, zzahlVar);
            case 15:
                int zzc2 = zzahi.zzc(bArr, i10, zzahlVar);
                zzahlVar.zzc = Integer.valueOf(zzaib.zze(zzahlVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzahi.zzd(bArr, i10, zzahlVar);
                zzahlVar.zzc = Long.valueOf(zzaib.zza(zzahlVar.zzb));
                return zzd3;
            case 17:
                return zzahi.zzb(bArr, i10, zzahlVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i10) {
        return this.zzc[i10 + 1];
    }

    private final zzajh zzd(int i10) {
        return (zzajh) this.zzd[((i10 / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (!zzg(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzaja) {
            return ((zzaja) obj).zzv();
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final int zzb(T t9) {
        int i10;
        int zza2;
        int i11;
        int zzc;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int zzc2 = zzc(i13);
            int i14 = this.zzc[i13];
            long j4 = 1048575 & zzc2;
            int i15 = 37;
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    i10 = i12 * 53;
                    zza2 = zzajc.zza(Double.doubleToLongBits(zzamh.zza(t9, j4)));
                    i12 = zza2 + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    zza2 = Float.floatToIntBits(zzamh.zzb(t9, j4));
                    i12 = zza2 + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    zza2 = zzajc.zza(zzamh.zzd(t9, j4));
                    i12 = zza2 + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    zza2 = zzajc.zza(zzamh.zzd(t9, j4));
                    i12 = zza2 + i10;
                    break;
                case 4:
                    i11 = i12 * 53;
                    zzc = zzamh.zzc(t9, j4);
                    i12 = i11 + zzc;
                    break;
                case 5:
                    i10 = i12 * 53;
                    zza2 = zzajc.zza(zzamh.zzd(t9, j4));
                    i12 = zza2 + i10;
                    break;
                case 6:
                    i11 = i12 * 53;
                    zzc = zzamh.zzc(t9, j4);
                    i12 = i11 + zzc;
                    break;
                case zzaja.zze.zzg /* 7 */:
                    i10 = i12 * 53;
                    zza2 = zzajc.zza(zzamh.zzh(t9, j4));
                    i12 = zza2 + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    zza2 = ((String) zzamh.zze(t9, j4)).hashCode();
                    i12 = zza2 + i10;
                    break;
                case 9:
                    Object zze = zzamh.zze(t9, j4);
                    if (zze != null) {
                        i15 = zze.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i10 = i12 * 53;
                    zza2 = zzamh.zze(t9, j4).hashCode();
                    i12 = zza2 + i10;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    i11 = i12 * 53;
                    zzc = zzamh.zzc(t9, j4);
                    i12 = i11 + zzc;
                    break;
                case 12:
                    i11 = i12 * 53;
                    zzc = zzamh.zzc(t9, j4);
                    i12 = i11 + zzc;
                    break;
                case 13:
                    i11 = i12 * 53;
                    zzc = zzamh.zzc(t9, j4);
                    i12 = i11 + zzc;
                    break;
                case 14:
                    i10 = i12 * 53;
                    zza2 = zzajc.zza(zzamh.zzd(t9, j4));
                    i12 = zza2 + i10;
                    break;
                case 15:
                    i11 = i12 * 53;
                    zzc = zzamh.zzc(t9, j4);
                    i12 = i11 + zzc;
                    break;
                case 16:
                    i10 = i12 * 53;
                    zza2 = zzajc.zza(zzamh.zzd(t9, j4));
                    i12 = zza2 + i10;
                    break;
                case 17:
                    Object zze2 = zzamh.zze(t9, j4);
                    if (zze2 != null) {
                        i15 = zze2.hashCode();
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
                    zza2 = zzamh.zze(t9, j4).hashCode();
                    i12 = zza2 + i10;
                    break;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    i10 = i12 * 53;
                    zza2 = zzamh.zze(t9, j4).hashCode();
                    i12 = zza2 + i10;
                    break;
                case 51:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzajc.zza(Double.doubleToLongBits(zza(t9, j4)));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = Float.floatToIntBits(zzb(t9, j4));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzajc.zza(zzd(t9, j4));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzajc.zza(zzd(t9, j4));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzc(t9, j4);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzajc.zza(zzd(t9, j4));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzc(t9, j4);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzajc.zza(zze(t9, j4));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = ((String) zzamh.zze(t9, j4)).hashCode();
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzamh.zze(t9, j4).hashCode();
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzamh.zze(t9, j4).hashCode();
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzc(t9, j4);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzc(t9, j4);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzc(t9, j4);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzajc.zza(zzd(t9, j4));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzc(t9, j4);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzajc.zza(zzd(t9, j4));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzako<T>) t9, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzamh.zze(t9, j4).hashCode();
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzq.zzd(t9).hashCode() + (i12 * 53);
        return this.zzh ? (hashCode * 53) + this.zzr.zza(t9).hashCode() : hashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final void zzc(T t9) {
        if (zzg(t9)) {
            if (t9 instanceof zzaja) {
                zzaja zzajaVar = (zzaja) t9;
                zzajaVar.zzb(f.API_PRIORITY_OTHER);
                zzajaVar.zza = 0;
                zzajaVar.zzt();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzc = zzc(i10);
                long j4 = 1048575 & zzc;
                int i11 = (zzc & 267386880) >>> 20;
                if (i11 != 9) {
                    if (i11 != 60 && i11 != 68) {
                        switch (i11) {
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
                                this.zzp.zzb(t9, j4);
                                break;
                            case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t9, j4);
                                if (object != null) {
                                    unsafe.putObject(t9, j4, this.zzs.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzc((zzako<T>) t9, this.zzc[i10], i10)) {
                        zze(i10).zzc(zzb.getObject(t9, j4));
                    }
                }
                if (zzc((zzako<T>) t9, i10)) {
                    zze(i10).zzc(zzb.getObject(t9, j4));
                }
            }
            this.zzq.zzf(t9);
            if (this.zzh) {
                this.zzr.zzc(t9);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.firebase-auth-api.zzalc] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.firebase-auth-api.zzalc] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final boolean zzd(T t9) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean z9 = true;
            if (i14 >= this.zzm) {
                return !this.zzh || this.zzr.zza(t9).zzg();
            }
            int i15 = this.zzl[i14];
            int i16 = this.zzc[i15];
            int zzc = zzc(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(t9, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (((268435456 & zzc) != 0) && !zza((zzako<T>) t9, i15, i10, i11, i19)) {
                return false;
            }
            int i20 = (267386880 & zzc) >>> 20;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (zzc((zzako<T>) t9, i16, i15) && !zza((Object) t9, zzc, zze(i15))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = this.zzs.zzd(zzamh.zze(t9, zzc & 1048575));
                            if (!zzd.isEmpty()) {
                                if (this.zzs.zza(zzf(i15)).zzc.zzb() == zzamy.MESSAGE) {
                                    Iterator<?> it = zzd.values().iterator();
                                    ?? r12 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        r12 = r12;
                                        if (r12 == 0) {
                                            r12 = zzaky.zza().zza((Class) next.getClass());
                                        }
                                        if (!r12.zzd(next)) {
                                            z9 = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z9) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzamh.zze(t9, zzc & 1048575);
                if (!list.isEmpty()) {
                    ?? zze = zze(i15);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            break;
                        }
                        if (!zze.zzd(list.get(i21))) {
                            z9 = false;
                            break;
                        }
                        i21++;
                    }
                }
                if (!z9) {
                    return false;
                }
            } else if (zza((zzako<T>) t9, i15, i10, i11, i19) && !zza((Object) t9, zzc, zze(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
    }

    private static zzame zze(Object obj) {
        zzaja zzajaVar = (zzaja) obj;
        zzame zzameVar = zzajaVar.zzb;
        if (zzameVar != zzame.zzc()) {
            return zzameVar;
        }
        zzame zzd = zzame.zzd();
        zzajaVar.zzb = zzd;
        return zzd;
    }

    private static <T> boolean zze(T t9, long j4) {
        return ((Boolean) zzamh.zze(t9, j4)).booleanValue();
    }

    private final boolean zzc(T t9, T t10, int i10) {
        return zzc((zzako<T>) t9, i10) == zzc((zzako<T>) t10, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x005a. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final int zza(T t9) {
        int i10;
        int i11;
        int i12;
        boolean z9;
        int zza2;
        int zza3;
        int zzd;
        int zzd2;
        int zzg;
        int zzh;
        int zza4;
        Unsafe unsafe = zzb;
        ?? r9 = 0;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i15 < this.zzc.length) {
            int zzc = zzc(i15);
            int i18 = (267386880 & zzc) >>> 20;
            int[] iArr = this.zzc;
            int i19 = iArr[i15];
            int i20 = iArr[i15 + 2];
            int i21 = i20 & i13;
            if (i18 <= 17) {
                if (i21 != i17) {
                    i14 = i21 == i13 ? r9 : unsafe.getInt(t9, i21);
                    i17 = i21;
                }
                i10 = i17;
                i11 = i14;
                i12 = 1 << (i20 >>> 20);
            } else {
                i10 = i17;
                i11 = i14;
                i12 = r9;
            }
            long j4 = zzc & i13;
            if (i18 >= zzaix.zza.zza()) {
                zzaix.zzb.zza();
            }
            int i22 = i12;
            switch (i18) {
                case 0:
                    z9 = r9;
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza2 = zzaii.zza(i19, 0.0d);
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    z9 = r9;
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza2 = zzaii.zza(i19, 0.0f);
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    z9 = r9;
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza2 = zzaii.zzb(i19, unsafe.getLong(t9, j4));
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    z9 = r9;
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza2 = zzaii.zze(i19, unsafe.getLong(t9, j4));
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    z9 = r9;
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza2 = zzaii.zzc(i19, unsafe.getInt(t9, j4));
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    z9 = r9;
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza2 = zzaii.zza(i19, 0L);
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        z9 = false;
                        zza2 = zzaii.zzb(i19, 0);
                        i16 += zza2;
                        break;
                    }
                    z9 = false;
                    break;
                case zzaja.zze.zzg /* 7 */:
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza3 = zzaii.zza(i19, true);
                        i16 += zza3;
                    }
                    z9 = false;
                    break;
                case 8:
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        Object object = unsafe.getObject(t9, j4);
                        if (object instanceof zzahm) {
                            zza3 = zzaii.zza(i19, (zzahm) object);
                        } else {
                            zza3 = zzaii.zza(i19, (String) object);
                        }
                        i16 += zza3;
                    }
                    z9 = false;
                    break;
                case 9:
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        i16 += zzale.zza(i19, unsafe.getObject(t9, j4), zze(i15));
                    }
                    z9 = false;
                    break;
                case 10:
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza3 = zzaii.zza(i19, (zzahm) unsafe.getObject(t9, j4));
                        i16 += zza3;
                    }
                    z9 = false;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza3 = zzaii.zzf(i19, unsafe.getInt(t9, j4));
                        i16 += zza3;
                    }
                    z9 = false;
                    break;
                case 12:
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza3 = zzaii.zza(i19, unsafe.getInt(t9, j4));
                        i16 += zza3;
                    }
                    z9 = false;
                    break;
                case 13:
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        i16 += zzaii.zzd(i19, 0);
                    }
                    z9 = false;
                    break;
                case 14:
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza3 = zzaii.zzc(i19, 0L);
                        i16 += zza3;
                    }
                    z9 = false;
                    break;
                case 15:
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza3 = zzaii.zze(i19, unsafe.getInt(t9, j4));
                        i16 += zza3;
                    }
                    z9 = false;
                    break;
                case 16:
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza3 = zzaii.zzd(i19, unsafe.getLong(t9, j4));
                        i16 += zza3;
                    }
                    z9 = false;
                    break;
                case 17:
                    if (zza((zzako<T>) t9, i15, i10, i11, i22)) {
                        zza3 = zzaii.zza(i19, (zzakk) unsafe.getObject(t9, j4), zze(i15));
                        i16 += zza3;
                    }
                    z9 = false;
                    break;
                case 18:
                    zzd = zzale.zzd(i19, (List) unsafe.getObject(t9, j4), r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 19:
                    zzd = zzale.zzc(i19, (List) unsafe.getObject(t9, j4), r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 20:
                    zzd = zzale.zzf(i19, (List) unsafe.getObject(t9, j4), r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 21:
                    zzd = zzale.zzj(i19, (List) unsafe.getObject(t9, j4), r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 22:
                    zzd = zzale.zze(i19, (List) unsafe.getObject(t9, j4), r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 23:
                    zzd = zzale.zzd(i19, (List) unsafe.getObject(t9, j4), r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 24:
                    zzd = zzale.zzc(i19, (List) unsafe.getObject(t9, j4), r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 25:
                    zzd = zzale.zza(i19, (List<?>) unsafe.getObject(t9, j4), (boolean) r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 26:
                    zzd = zzale.zzb(i19, (List) unsafe.getObject(t9, j4));
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 27:
                    zzd = zzale.zzb(i19, (List<?>) unsafe.getObject(t9, j4), zze(i15));
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 28:
                    zzd = zzale.zza(i19, (List<zzahm>) unsafe.getObject(t9, j4));
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 29:
                    zzd = zzale.zzi(i19, (List) unsafe.getObject(t9, j4), r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 30:
                    zzd = zzale.zzb(i19, (List<Integer>) unsafe.getObject(t9, j4), (boolean) r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 31:
                    zzd = zzale.zzc(i19, (List) unsafe.getObject(t9, j4), r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 32:
                    zzd = zzale.zzd(i19, (List) unsafe.getObject(t9, j4), r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 33:
                    zzd = zzale.zzg(i19, (List) unsafe.getObject(t9, j4), r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 34:
                    zzd = zzale.zzh(i19, (List) unsafe.getObject(t9, j4), r9);
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 35:
                    zzd2 = zzale.zzd((List) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 36:
                    zzd2 = zzale.zzc((List) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 37:
                    zzd2 = zzale.zzf((List) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 38:
                    zzd2 = zzale.zzj((List) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 39:
                    zzd2 = zzale.zze((List) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 40:
                    zzd2 = zzale.zzd((List) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 41:
                    zzd2 = zzale.zzc((List) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 42:
                    zzd2 = zzale.zza((List<?>) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 43:
                    zzd2 = zzale.zzi((List) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 44:
                    zzd2 = zzale.zzb((List) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 45:
                    zzd2 = zzale.zzc((List) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 46:
                    zzd2 = zzale.zzd((List) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 47:
                    zzd2 = zzale.zzg((List) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 48:
                    zzd2 = zzale.zzh((List) unsafe.getObject(t9, j4));
                    if (zzd2 > 0) {
                        zzg = zzaii.zzg(i19);
                        zzh = zzaii.zzh(zzd2);
                        i16 += zzh + zzg + zzd2;
                    }
                    z9 = r9;
                    break;
                case 49:
                    zzd = zzale.zza(i19, (List<zzakk>) unsafe.getObject(t9, j4), zze(i15));
                    i16 += zzd;
                    z9 = r9;
                    break;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    zzd = this.zzs.zza(i19, unsafe.getObject(t9, j4), zzf(i15));
                    i16 += zzd;
                    z9 = r9;
                    break;
                case 51:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zza(i19, 0.0d);
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 52:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zza(i19, 0.0f);
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 53:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zzb(i19, zzd(t9, j4));
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 54:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zze(i19, zzd(t9, j4));
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 55:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zzc(i19, zzc(t9, j4));
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 56:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zza(i19, 0L);
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 57:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zzb(i19, (int) r9);
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 58:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zza(i19, true);
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 59:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        Object object2 = unsafe.getObject(t9, j4);
                        if (object2 instanceof zzahm) {
                            zza4 = zzaii.zza(i19, (zzahm) object2);
                        } else {
                            zza4 = zzaii.zza(i19, (String) object2);
                        }
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 60:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zzd = zzale.zza(i19, unsafe.getObject(t9, j4), zze(i15));
                        i16 += zzd;
                    }
                    z9 = r9;
                    break;
                case 61:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zza(i19, (zzahm) unsafe.getObject(t9, j4));
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 62:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zzf(i19, zzc(t9, j4));
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 63:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zza(i19, zzc(t9, j4));
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 64:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zzd(i19, (int) r9);
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 65:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zzc(i19, 0L);
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 66:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zze(i19, zzc(t9, j4));
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 67:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zzd(i19, zzd(t9, j4));
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                case 68:
                    if (zzc((zzako<T>) t9, i19, i15)) {
                        zza4 = zzaii.zza(i19, (zzakk) unsafe.getObject(t9, j4), zze(i15));
                        i16 += zza4;
                    }
                    z9 = r9;
                    break;
                default:
                    z9 = r9;
                    break;
            }
            i15 += 3;
            i17 = i10;
            r9 = z9;
            i14 = i11;
            i13 = 1048575;
        }
        int i23 = r9;
        zzamb<?, ?> zzambVar = this.zzq;
        int zza5 = i16 + zzambVar.zza((zzamb<?, ?>) zzambVar.zzd(t9));
        if (!this.zzh) {
            return zza5;
        }
        zzais<?> zza6 = this.zzr.zza(t9);
        for (int i24 = i23; i24 < zza6.zza.zzb(); i24++) {
            Map.Entry<?, Object> zzb2 = zza6.zza.zzb(i24);
            i23 += zzais.zza((zzaiu<?>) zzb2.getKey(), zzb2.getValue());
        }
        for (Map.Entry<?, Object> entry : zza6.zza.zzc()) {
            i23 += zzais.zza((zzaiu<?>) entry.getKey(), entry.getValue());
        }
        return zza5 + i23;
    }

    private final boolean zzc(T t9, int i10) {
        int zzb2 = zzb(i10);
        long j4 = zzb2 & 1048575;
        if (j4 != 1048575) {
            return (zzamh.zzc(t9, j4) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i10);
        long j10 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzamh.zza(t9, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzamh.zzb(t9, j10)) != 0;
            case 2:
                return zzamh.zzd(t9, j10) != 0;
            case 3:
                return zzamh.zzd(t9, j10) != 0;
            case 4:
                return zzamh.zzc(t9, j10) != 0;
            case 5:
                return zzamh.zzd(t9, j10) != 0;
            case 6:
                return zzamh.zzc(t9, j10) != 0;
            case zzaja.zze.zzg /* 7 */:
                return zzamh.zzh(t9, j10);
            case 8:
                Object zze = zzamh.zze(t9, j10);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzahm) {
                    return !zzahm.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzamh.zze(t9, j10) != null;
            case 10:
                return !zzahm.zza.equals(zzamh.zze(t9, j10));
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return zzamh.zzc(t9, j10) != 0;
            case 12:
                return zzamh.zzc(t9, j10) != 0;
            case 13:
                return zzamh.zzc(t9, j10) != 0;
            case 14:
                return zzamh.zzd(t9, j10) != 0;
            case 15:
                return zzamh.zzc(t9, j10) != 0;
            case 16:
                return zzamh.zzd(t9, j10) != 0;
            case 17:
                return zzamh.zze(t9, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzc(T t9, int i10, int i11) {
        return zzamh.zzc(t9, (long) (zzb(i11) & 1048575)) == i10;
    }

    private final int zzb(int i10) {
        return this.zzc[i10 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t9, T t10, int i10) {
        int i11 = this.zzc[i10];
        if (zzc((zzako<T>) t10, i11, i10)) {
            long zzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t10, zzc);
            if (object != null) {
                zzalc zze = zze(i10);
                if (!zzc((zzako<T>) t9, i11, i10)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t9, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t9, zzc, zza2);
                    }
                    zzb((zzako<T>) t9, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t9, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t9, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t10));
        }
    }

    private final void zzb(T t9, int i10) {
        int zzb2 = zzb(i10);
        long j4 = 1048575 & zzb2;
        if (j4 == 1048575) {
            return;
        }
        zzamh.zza((Object) t9, j4, (1 << (zzb2 >>> 20)) | zzamh.zzc(t9, j4));
    }

    private final void zzb(T t9, int i10, int i11) {
        zzamh.zza((Object) t9, zzb(i11) & 1048575, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzale.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamh.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamh.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzale.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamh.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamh.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzale.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamh.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamh.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzale.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamh.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamh.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzh(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzh(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzb(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzamh.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzamh.zza(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzale.zza(com.google.android.gms.internal.p002firebaseauthapi.zzamh.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzamh.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c5 A[LOOP:0: B:2:0x0005->B:86:0x01c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzako.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x09dc, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzajj.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0ce8, code lost:
    
        if (r14 == r0) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0cea, code lost:
    
        r28.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0cf0, code lost:
    
        r10 = r9.zzm;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0cf7, code lost:
    
        if (r10 >= r9.zzn) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0cf9, code lost:
    
        r3 = (com.google.android.gms.internal.p002firebaseauthapi.zzame) zza((java.lang.Object) r32, r9.zzl[r10], (int) r3, (com.google.android.gms.internal.p002firebaseauthapi.zzamb<UT, int>) r9.zzq, (java.lang.Object) r32);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0d0f, code lost:
    
        if (r3 == null) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0d11, code lost:
    
        r9.zzq.zzb((java.lang.Object) r7, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0d16, code lost:
    
        if (r6 != 0) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0d1a, code lost:
    
        if (r8 != r35) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0d21, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzajj.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0d28, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0d24, code lost:
    
        if (r8 > r35) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0d26, code lost:
    
        if (r11 != r6) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0d2d, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzajj.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:121:0x0a02. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:204:0x0426. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:546:0x00b3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0c5f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0ccb  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x08c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x08b3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v135, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(T r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.p002firebaseauthapi.zzahl r37) {
        /*
            Method dump skipped, instructions count: 3522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzako.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzahl):int");
    }

    private final int zza(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zza(i10, 0);
    }

    private final int zza(int i10, int i11) {
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

    /* JADX WARN: Removed duplicated region for block: B:65:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.android.gms.internal.p002firebaseauthapi.zzako<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.p002firebaseauthapi.zzaki r33, com.google.android.gms.internal.p002firebaseauthapi.zzaks r34, com.google.android.gms.internal.p002firebaseauthapi.zzajt r35, com.google.android.gms.internal.p002firebaseauthapi.zzamb<?, ?> r36, com.google.android.gms.internal.p002firebaseauthapi.zzair<?> r37, com.google.android.gms.internal.p002firebaseauthapi.zzakh r38) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzako.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzaki, com.google.android.gms.internal.firebase-auth-api.zzaks, com.google.android.gms.internal.firebase-auth-api.zzajt, com.google.android.gms.internal.firebase-auth-api.zzamb, com.google.android.gms.internal.firebase-auth-api.zzair, com.google.android.gms.internal.firebase-auth-api.zzakh):com.google.android.gms.internal.firebase-auth-api.zzako");
    }

    private final <UT, UB> UB zza(Object obj, int i10, UB ub, zzamb<UT, UB> zzambVar, Object obj2) {
        zzajh zzd;
        int i11 = this.zzc[i10];
        Object zze = zzamh.zze(obj, zzc(i10) & 1048575);
        return (zze == null || (zzd = zzd(i10)) == null) ? ub : (UB) zza(i10, i11, this.zzs.zze(zze), zzd, (zzajh) ub, (zzamb<UT, zzajh>) zzambVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i10, int i11, Map<K, V> map, zzajh zzajhVar, UB ub, zzamb<UT, UB> zzambVar, Object obj) {
        zzakf<?, ?> zza2 = this.zzs.zza(zzf(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzajhVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzambVar.zzc(obj);
                }
                zzahv zzc = zzahm.zzc(zzakc.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzakc.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzambVar.zza((zzamb<UT, UB>) ub, i11, zzc.zza());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t9, int i10) {
        zzalc zze = zze(i10);
        long zzc = zzc(i10) & 1048575;
        if (!zzc((zzako<T>) t9, i10)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t9, zzc);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t9, int i10, int i11) {
        zzalc zze = zze(i11);
        if (!zzc((zzako<T>) t9, i10, i11)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t9, zzc(i11) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final void zza(T t9, T t10) {
        zzf(t9);
        t10.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzc = zzc(i10);
            long j4 = 1048575 & zzc;
            int i11 = this.zzc[i10];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza(t9, j4, zzamh.zza(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza((Object) t9, j4, zzamh.zzb(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza((Object) t9, j4, zzamh.zzd(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza((Object) t9, j4, zzamh.zzd(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza((Object) t9, j4, zzamh.zzc(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza((Object) t9, j4, zzamh.zzd(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza((Object) t9, j4, zzamh.zzc(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case zzaja.zze.zzg /* 7 */:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zzc(t9, j4, zzamh.zzh(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza(t9, j4, zzamh.zze(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t9, t10, i10);
                    break;
                case 10:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza(t9, j4, zzamh.zze(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza((Object) t9, j4, zzamh.zzc(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza((Object) t9, j4, zzamh.zzc(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza((Object) t9, j4, zzamh.zzc(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza((Object) t9, j4, zzamh.zzd(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza((Object) t9, j4, zzamh.zzc(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzako<T>) t10, i10)) {
                        zzamh.zza((Object) t9, j4, zzamh.zzd(t10, j4));
                        zzb((zzako<T>) t9, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t9, t10, i10);
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
                    this.zzp.zza(t9, t10, j4);
                    break;
                case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                    zzale.zza(this.zzs, t9, t10, j4);
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
                    if (zzc((zzako<T>) t10, i11, i10)) {
                        zzamh.zza(t9, j4, zzamh.zze(t10, j4));
                        zzb((zzako<T>) t9, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t9, t10, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzako<T>) t10, i11, i10)) {
                        zzamh.zza(t9, j4, zzamh.zze(t10, j4));
                        zzb((zzako<T>) t9, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t9, t10, i10);
                    break;
            }
        }
        zzale.zza(this.zzq, t9, t10);
        if (this.zzh) {
            zzale.zza(this.zzr, t9, t10);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00bd. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x065b A[LOOP:2: B:36:0x0657->B:38:0x065b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0624 A[Catch: all -> 0x0297, TryCatch #3 {all -> 0x0297, blocks: (B:15:0x05f8, B:44:0x061f, B:46:0x0624, B:47:0x0629, B:161:0x00cb, B:67:0x00dd, B:70:0x00ef, B:71:0x0101, B:72:0x0112, B:73:0x0123, B:75:0x012d, B:78:0x0134, B:79:0x013b, B:80:0x0148, B:81:0x0159, B:82:0x0166, B:83:0x0177, B:84:0x0182, B:85:0x0193, B:86:0x01a4, B:87:0x01b5, B:88:0x01c6, B:89:0x01d7, B:90:0x01e8, B:91:0x01f9, B:92:0x020b, B:94:0x021b, B:95:0x023c, B:96:0x0225, B:98:0x022d, B:99:0x024d, B:100:0x025f, B:101:0x026d, B:102:0x027b, B:103:0x0289), top: B:14:0x05f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x062f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.firebase-auth-api.zzald] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r18, com.google.android.gms.internal.p002firebaseauthapi.zzald r19, com.google.android.gms.internal.p002firebaseauthapi.zzaip r20) {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzako.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzald, com.google.android.gms.internal.firebase-auth-api.zzaip):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final void zza(T t9, byte[] bArr, int i10, int i11, zzahl zzahlVar) {
        zza((zzako<T>) t9, bArr, i10, i11, 0, zzahlVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t9, T t10, int i10) {
        if (zzc((zzako<T>) t10, i10)) {
            long zzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t10, zzc);
            if (object != null) {
                zzalc zze = zze(i10);
                if (!zzc((zzako<T>) t9, i10)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t9, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t9, zzc, zza2);
                    }
                    zzb((zzako<T>) t9, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t9, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t9, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t10));
        }
    }

    private final void zza(Object obj, int i10, zzald zzaldVar) {
        if (zzg(i10)) {
            zzamh.zza(obj, i10 & 1048575, zzaldVar.zzr());
        } else if (this.zzi) {
            zzamh.zza(obj, i10 & 1048575, zzaldVar.zzq());
        } else {
            zzamh.zza(obj, i10 & 1048575, zzaldVar.zzp());
        }
    }

    private final void zza(T t9, int i10, Object obj) {
        zzb.putObject(t9, zzc(i10) & 1048575, obj);
        zzb((zzako<T>) t9, i10);
    }

    private final void zza(T t9, int i10, int i11, Object obj) {
        zzb.putObject(t9, zzc(i11) & 1048575, obj);
        zzb((zzako<T>) t9, i10, i11);
    }

    private final <K, V> void zza(zzanb zzanbVar, int i10, Object obj, int i11) {
        if (obj != null) {
            zzanbVar.zza(i10, this.zzs.zza(zzf(i11)), this.zzs.zzd(obj));
        }
    }

    private static void zza(int i10, Object obj, zzanb zzanbVar) {
        if (obj instanceof String) {
            zzanbVar.zza(i10, (String) obj);
        } else {
            zzanbVar.zza(i10, (zzahm) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:320:0x05b6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b8f  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r24, com.google.android.gms.internal.p002firebaseauthapi.zzanb r25) {
        /*
            Method dump skipped, instructions count: 3270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzako.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzanb):void");
    }

    private static <UT, UB> void zza(zzamb<UT, UB> zzambVar, T t9, zzanb zzanbVar) {
        zzambVar.zzb((zzamb<UT, UB>) zzambVar.zzd(t9), zzanbVar);
    }

    private final boolean zza(T t9, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzc((zzako<T>) t9, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i10, zzalc zzalcVar) {
        return zzalcVar.zzd(zzamh.zze(obj, i10 & 1048575));
    }
}
