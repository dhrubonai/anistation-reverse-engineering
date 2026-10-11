package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzale {
    private static final Class<?> zza = zzd();
    private static final zzamb<?, ?> zzb = zzc();
    private static final zzamb<?, ?> zzc = new zzamd();

    public static int zza(int i10, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaii.zza(i10, true) * size;
    }

    public static int zzb(int i10, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * size) + zzb(list);
    }

    public static int zzc(int i10, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaii.zzb(i10, 0) * size;
    }

    public static int zzd(int i10, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaii.zza(i10, 0L) * size;
    }

    public static int zze(int i10, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * size) + zze(list);
    }

    public static int zzf(int i10, List<Long> list, boolean z9) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * list.size()) + zzf(list);
    }

    public static int zzg(int i10, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * size) + zzg(list);
    }

    public static int zzh(int i10, List<Long> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * size) + zzh(list);
    }

    public static int zzi(int i10, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * size) + zzi(list);
    }

    public static int zzj(int i10, List<Long> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaii.zzg(i10) * size) + zzj(list);
    }

    public static void zzk(int i10, List<Integer> list, zzanb zzanbVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzanbVar.zzk(i10, list, z9);
        }
    }

    public static void zzl(int i10, List<Long> list, zzanb zzanbVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzanbVar.zzl(i10, list, z9);
        }
    }

    public static void zzm(int i10, List<Integer> list, zzanb zzanbVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzanbVar.zzm(i10, list, z9);
        }
    }

    public static void zzn(int i10, List<Long> list, zzanb zzanbVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            zzanbVar.zzn(i10, list, z9);
        }
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static int zza(int i10, List<zzahm> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzg = zzaii.zzg(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzg += zzaii.zza(list.get(i11));
        }
        return zzg;
    }

    public static int zzb(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zza(zzajdVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zza(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    private static zzamb<?, ?> zzc() {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzamb) zze.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int zze(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzc(zzajdVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzc(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzf(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzb(zzajzVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzb(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzg(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzf(zzajdVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzf(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzh(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzd(zzajzVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzd(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzi(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzh(zzajdVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zzh(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzj(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zze(zzajzVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzaii.zze(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzd(int i10, List<Integer> list, zzanb zzanbVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzd(i10, list, z9);
    }

    public static void zzc(int i10, List<Integer> list, zzanb zzanbVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzc(i10, list, z9);
    }

    public static int zza(int i10, List<zzakk> list, zzalc zzalcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzaii.zza(i10, list.get(i12), zzalcVar);
        }
        return i11;
    }

    public static int zzb(int i10, List<?> list, zzalc zzalcVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzg = zzaii.zzg(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzajo) {
                zza2 = zzaii.zza((zzajo) obj);
            } else {
                zza2 = zzaii.zza((zzakk) obj, zzalcVar);
            }
            zzg = zza2 + zzg;
        }
        return zzg;
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzf(int i10, List<Float> list, zzanb zzanbVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzf(i10, list, z9);
    }

    public static void zzg(int i10, List<Integer> list, zzanb zzanbVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzg(i10, list, z9);
    }

    public static void zzh(int i10, List<Long> list, zzanb zzanbVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzh(i10, list, z9);
    }

    public static void zzi(int i10, List<Integer> list, zzanb zzanbVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzi(i10, list, z9);
    }

    public static void zzj(int i10, List<Long> list, zzanb zzanbVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzj(i10, list, z9);
    }

    public static int zza(int i10, Object obj, zzalc zzalcVar) {
        if (obj instanceof zzajo) {
            return zzaii.zzb(i10, (zzajo) obj);
        }
        return zzaii.zzb(i10, (zzakk) obj, zzalcVar);
    }

    public static void zze(int i10, List<Long> list, zzanb zzanbVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zze(i10, list, z9);
    }

    public static zzamb<?, ?> zza() {
        return zzb;
    }

    public static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzajh zzajhVar, UB ub, zzamb<UT, UB> zzambVar) {
        if (zzajhVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (zzajhVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = (UB) zza(obj, i10, intValue, ub, zzambVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzajhVar.zza(intValue2)) {
                    ub = (UB) zza(obj, i10, intValue2, ub, zzambVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static int zzb(int i10, List<?> list) {
        int zza2;
        int zza3;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int zzg = zzaii.zzg(i10) * size;
        if (list instanceof zzajq) {
            zzajq zzajqVar = (zzajq) list;
            while (i11 < size) {
                Object zzb2 = zzajqVar.zzb(i11);
                if (zzb2 instanceof zzahm) {
                    zza3 = zzaii.zza((zzahm) zzb2);
                } else {
                    zza3 = zzaii.zza((String) zzb2);
                }
                zzg = zza3 + zzg;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzahm) {
                    zza2 = zzaii.zza((zzahm) obj);
                } else {
                    zza2 = zzaii.zza((String) obj);
                }
                zzg = zza2 + zzg;
                i11++;
            }
        }
        return zzg;
    }

    public static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub, zzamb<UT, UB> zzambVar) {
        if (ub == null) {
            ub = zzambVar.zzc(obj);
        }
        zzambVar.zzb(ub, i10, i11);
        return ub;
    }

    public static zzamb<?, ?> zzb() {
        return zzc;
    }

    public static <T, FT extends zzaiu<FT>> void zza(zzair<FT> zzairVar, T t9, T t10) {
        zzais<FT> zza2 = zzairVar.zza(t10);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzairVar.zzb(t9).zza(zza2);
    }

    public static void zzb(int i10, List<Double> list, zzanb zzanbVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzb(i10, list, z9);
    }

    public static void zzb(int i10, List<?> list, zzanb zzanbVar, zzalc zzalcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzb(i10, list, zzalcVar);
    }

    public static <T> void zza(zzakh zzakhVar, T t9, T t10, long j4) {
        zzamh.zza(t9, j4, zzakhVar.zza(zzamh.zze(t9, j4), zzamh.zze(t10, j4)));
    }

    public static void zzb(int i10, List<String> list, zzanb zzanbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zzb(i10, list);
    }

    public static <T, UT, UB> void zza(zzamb<UT, UB> zzambVar, T t9, T t10) {
        zzambVar.zzc(t9, zzambVar.zza(zzambVar.zzd(t9), zzambVar.zzd(t10)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzaja.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i10, List<Boolean> list, zzanb zzanbVar, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zza(i10, list, z9);
    }

    public static void zza(int i10, List<zzahm> list, zzanb zzanbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zza(i10, list);
    }

    public static void zza(int i10, List<?> list, zzanb zzanbVar, zzalc zzalcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanbVar.zza(i10, list, zzalcVar);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
