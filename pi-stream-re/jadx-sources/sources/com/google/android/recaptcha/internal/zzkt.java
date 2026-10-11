package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkt {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzll zzc;
    private static final zzll zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzll zzllVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzllVar = (zzll) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzllVar;
        zzd = new zzln();
    }

    public static void zzA(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzu(i10, list, z9);
        }
    }

    public static void zzB(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzy(i10, list, z9);
        }
    }

    public static void zzC(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzA(i10, list, z9);
        }
    }

    public static void zzD(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzC(i10, list, z9);
        }
    }

    public static void zzE(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzE(i10, list, z9);
        }
    }

    public static void zzF(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzJ(i10, list, z9);
        }
    }

    public static void zzG(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzL(i10, list, z9);
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int zza(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzu(zziuVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzb(int i10, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhh.zzy(i10 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i10, List list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhh.zzy(i10 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzu(zziuVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzg(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjt) {
            zzjt zzjtVar = (zzjt) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzz(zzjtVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzz(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzh(int i10, Object obj, zzkr zzkrVar) {
        int i11 = i10 << 3;
        if (obj instanceof zzjk) {
            int i12 = zzhh.zzb;
            int zza2 = ((zzjk) obj).zza();
            return zzhh.zzy(i11) + zzhh.zzy(zza2) + zza2;
        }
        return zzhh.zzy(i11) + zzhh.zzw((zzke) obj, zzkrVar);
    }

    public static int zzi(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zziuVar.zze(i11);
                i10 += zzhh.zzy((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzhh.zzy((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzj(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjt) {
            zzjt zzjtVar = (zzjt) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzjtVar.zze(i11);
                i10 += zzhh.zzz((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzhh.zzz((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzy(zziuVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzy(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjt) {
            zzjt zzjtVar = (zzjt) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzz(zzjtVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzhh.zzz(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzll zzm() {
        return zzc;
    }

    public static zzll zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i10, List list, zzix zzixVar, Object obj2, zzll zzllVar) {
        if (zzixVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzixVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj2 = zzp(obj, i10, intValue, obj2, zzllVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzixVar.zza(intValue2)) {
                    obj2 = zzp(obj, i10, intValue2, obj2, zzllVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i10, int i11, Object obj2, zzll zzllVar) {
        if (obj2 == null) {
            obj2 = zzllVar.zzc(obj);
        }
        zzllVar.zzl(obj2, i10, i11);
        return obj2;
    }

    public static void zzq(zzif zzifVar, Object obj, Object obj2) {
        zzij zzb2 = zzifVar.zzb(obj2);
        if (!zzb2.zza.isEmpty()) {
            zzifVar.zzc(obj).zzh(zzb2);
        }
    }

    public static void zzr(zzll zzllVar, Object obj, Object obj2) {
        zzllVar.zzo(obj, zzllVar.zze(zzllVar.zzd(obj), zzllVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzit.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzt(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzc(i10, list, z9);
        }
    }

    public static void zzu(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzg(i10, list, z9);
        }
    }

    public static void zzv(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzj(i10, list, z9);
        }
    }

    public static void zzw(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzl(i10, list, z9);
        }
    }

    public static void zzx(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzn(i10, list, z9);
        }
    }

    public static void zzy(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzp(i10, list, z9);
        }
    }

    public static void zzz(int i10, List list, zzmd zzmdVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzmdVar.zzs(i10, list, z9);
        }
    }
}
