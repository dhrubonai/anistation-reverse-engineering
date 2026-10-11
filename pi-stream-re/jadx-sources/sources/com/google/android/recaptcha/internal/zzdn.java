package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import l7.e;
import l7.f;
import o7.a;
import r6.h0;
import x6.j;
import x6.m;

/* loaded from: classes.dex */
public final class zzdn implements zzdd {
    public static final zzdn zza = new zzdn();

    private zzdn() {
    }

    private final Object zzb(Object obj, Object obj2) {
        boolean z9 = obj instanceof Byte;
        if (z9 && (obj2 instanceof Byte)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z10 = obj instanceof Short;
        if (z10 && (obj2 instanceof Short)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z11 = obj instanceof Integer;
        if (z11 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z12 = obj instanceof Long;
        if (z12 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z13 = obj instanceof Float;
        if (z13 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z14 = obj instanceof Double;
        if (z14 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i10 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(a.f8311a);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i10 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i10] % ((Number) obj2).intValue())));
                    i10++;
                }
                return new String(m.u0(arrayList), a.f8311a);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i10 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i10] % ((Number) obj2).intValue()));
                    i10++;
                }
                return m.w0(arrayList2);
            }
        }
        if (z9 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Integer.valueOf(b10 % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        }
        if (z10 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s9 : sArr) {
                arrayList4.add(Integer.valueOf(s9 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        }
        if (z11 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList5.add(Integer.valueOf(i11 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z12 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j4 : jArr) {
                arrayList6.add(Long.valueOf(j4 % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        if (z13 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f10 : fArr) {
                arrayList7.add(Float.valueOf(f10 % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        }
        if (z14 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d10 : dArr) {
                arrayList8.add(Double.valueOf(d10 % ((Number) obj).doubleValue()));
            }
            return arrayList8.toArray(new Double[0]);
        }
        boolean z15 = obj instanceof byte[];
        if (z15 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b11 : bArr2) {
                arrayList9.add(Integer.valueOf(b11 % ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z16 = obj instanceof short[];
        if (z16 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s10 : sArr2) {
                arrayList10.add(Integer.valueOf(s10 % ((Number) obj2).intValue()));
            }
            return arrayList10.toArray(new Integer[0]);
        }
        boolean z17 = obj instanceof int[];
        if (z17 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i10 < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i10] % ((Number) obj2).intValue()));
                i10++;
            }
            return m.w0(arrayList11);
        }
        boolean z18 = obj instanceof long[];
        if (z18 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j10 : jArr2) {
                arrayList12.add(Long.valueOf(j10 % ((Number) obj2).longValue()));
            }
            return arrayList12.toArray(new Long[0]);
        }
        boolean z19 = obj instanceof float[];
        if (z19 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f11 : fArr2) {
                arrayList13.add(Float.valueOf(f11 % ((Number) obj2).floatValue()));
            }
            return arrayList13.toArray(new Float[0]);
        }
        boolean z20 = obj instanceof double[];
        if (z20 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d11 : dArr2) {
                arrayList14.add(Double.valueOf(d11 % ((Number) obj2).doubleValue()));
            }
            return arrayList14.toArray(new Double[0]);
        }
        if (z15 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzdc.zza(this, length4, bArr4.length);
            f c12 = h0.c1(0, length4);
            ArrayList arrayList15 = new ArrayList(j.o0(c12));
            e it = c12.iterator();
            while (it.f6887c) {
                int b12 = it.b();
                arrayList15.add(Integer.valueOf(bArr3[b12] % bArr4[b12]));
            }
            return arrayList15.toArray(new Integer[0]);
        }
        if (z16 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzdc.zza(this, length5, sArr4.length);
            f c13 = h0.c1(0, length5);
            ArrayList arrayList16 = new ArrayList(j.o0(c13));
            e it2 = c13.iterator();
            while (it2.f6887c) {
                int b13 = it2.b();
                arrayList16.add(Integer.valueOf(sArr3[b13] % sArr4[b13]));
            }
            return arrayList16.toArray(new Integer[0]);
        }
        if (z17 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzdc.zza(this, length6, iArr4.length);
            f c14 = h0.c1(0, length6);
            ArrayList arrayList17 = new ArrayList(j.o0(c14));
            e it3 = c14.iterator();
            while (it3.f6887c) {
                int b14 = it3.b();
                arrayList17.add(Integer.valueOf(iArr3[b14] % iArr4[b14]));
            }
            return arrayList17.toArray(new Integer[0]);
        }
        if (z18 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzdc.zza(this, length7, jArr4.length);
            f c15 = h0.c1(0, length7);
            ArrayList arrayList18 = new ArrayList(j.o0(c15));
            e it4 = c15.iterator();
            while (it4.f6887c) {
                int b15 = it4.b();
                arrayList18.add(Long.valueOf(jArr3[b15] % jArr4[b15]));
            }
            return arrayList18.toArray(new Long[0]);
        }
        if (z19 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzdc.zza(this, length8, fArr4.length);
            f c16 = h0.c1(0, length8);
            ArrayList arrayList19 = new ArrayList(j.o0(c16));
            e it5 = c16.iterator();
            while (it5.f6887c) {
                int b16 = it5.b();
                arrayList19.add(Float.valueOf(fArr3[b16] % fArr4[b16]));
            }
            return arrayList19.toArray(new Float[0]);
        }
        if (z20 && (obj2 instanceof double[])) {
            double[] dArr3 = (double[]) obj;
            int length9 = dArr3.length;
            double[] dArr4 = (double[]) obj2;
            zzdc.zza(this, length9, dArr4.length);
            f c17 = h0.c1(0, length9);
            ArrayList arrayList20 = new ArrayList(j.o0(c17));
            e it6 = c17.iterator();
            while (it6.f6887c) {
                int b17 = it6.b();
                arrayList20.add(Double.valueOf(dArr3[b17] % dArr4[b17]));
            }
            return arrayList20.toArray(new Double[0]);
        }
        throw new zzae(4, 5, null);
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        if (zzpqVarArr.length == 2) {
            Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
                if (true != (zza3 instanceof Object)) {
                    zza3 = null;
                }
                if (zza3 != null) {
                    try {
                        zzcjVar.zzc().zzf(i10, zzb(zza2, zza3));
                        return;
                    } catch (ArithmeticException e10) {
                        throw new zzae(4, 6, e10);
                    }
                }
                throw new zzae(4, 5, null);
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
