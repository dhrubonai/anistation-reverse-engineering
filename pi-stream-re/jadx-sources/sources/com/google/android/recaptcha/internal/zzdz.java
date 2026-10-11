package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import l7.e;
import l7.f;
import o7.a;
import r6.h0;
import x6.j;
import x6.m;

/* loaded from: classes.dex */
public final class zzdz implements zzdd {
    public static final zzdz zza = new zzdz();

    private zzdz() {
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
                    zzcjVar.zzc().zzf(i10, zzb(zza2, zza3));
                    return;
                }
                throw new zzae(4, 5, null);
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }

    public final Object zzb(Object obj, Object obj2) {
        boolean z9 = obj instanceof Byte;
        if (z9 && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z10 = obj instanceof Short;
        if (z10 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z11 = obj instanceof Integer;
        if (z11 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z12 = obj instanceof Long;
        if (z12 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj2).longValue() ^ ((Number) obj).longValue());
        }
        int i10 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(a.f8311a);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i10 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i10] ^ ((Number) obj2).byteValue())));
                    i10++;
                }
                return m.u0(arrayList);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i10 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i10] ^ ((Number) obj2).intValue()));
                    i10++;
                }
                return m.w0(arrayList2);
            }
        }
        if (z9 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b10 ^ ((Number) obj).byteValue())));
            }
            return arrayList3.toArray(new Byte[0]);
        }
        if (z10 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s9 : sArr) {
                arrayList4.add(Short.valueOf((short) (s9 ^ ((Number) obj).shortValue())));
            }
            return arrayList4.toArray(new Short[0]);
        }
        if (z11 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList5.add(Integer.valueOf(i11 ^ ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z12 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j4 : jArr) {
                arrayList6.add(Long.valueOf(j4 ^ ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        boolean z13 = obj instanceof byte[];
        if (z13 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList7 = new ArrayList(bArr2.length);
            for (byte b11 : bArr2) {
                arrayList7.add(Byte.valueOf((byte) (b11 ^ ((Number) obj2).byteValue())));
            }
            return arrayList7.toArray(new Byte[0]);
        }
        boolean z14 = obj instanceof short[];
        if (z14 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr2.length);
            for (short s10 : sArr2) {
                arrayList8.add(Short.valueOf((short) (s10 ^ ((Number) obj2).shortValue())));
            }
            return arrayList8.toArray(new Short[0]);
        }
        boolean z15 = obj instanceof int[];
        if (z15 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            ArrayList arrayList9 = new ArrayList(iArr2.length);
            for (int i12 : iArr2) {
                arrayList9.add(Integer.valueOf(i12 ^ ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z16 = obj instanceof long[];
        if (z16 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList10 = new ArrayList(jArr2.length);
            for (long j10 : jArr2) {
                arrayList10.add(Long.valueOf(j10 ^ ((Number) obj2).longValue()));
            }
            return arrayList10.toArray(new Long[0]);
        }
        if (z13 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length3 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzdc.zza(this, length3, bArr4.length);
            f c12 = h0.c1(0, length3);
            ArrayList arrayList11 = new ArrayList(j.o0(c12));
            e it = c12.iterator();
            while (it.f6887c) {
                int b12 = it.b();
                arrayList11.add(Byte.valueOf((byte) (bArr4[b12] ^ bArr3[b12])));
            }
            return arrayList11.toArray(new Byte[0]);
        }
        if (z14 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length4 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzdc.zza(this, length4, sArr4.length);
            f c13 = h0.c1(0, length4);
            ArrayList arrayList12 = new ArrayList(j.o0(c13));
            e it2 = c13.iterator();
            while (it2.f6887c) {
                int b13 = it2.b();
                arrayList12.add(Short.valueOf((short) (sArr4[b13] ^ sArr3[b13])));
            }
            return arrayList12.toArray(new Short[0]);
        }
        if (z15 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length5 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzdc.zza(this, length5, iArr4.length);
            f c14 = h0.c1(0, length5);
            ArrayList arrayList13 = new ArrayList(j.o0(c14));
            e it3 = c14.iterator();
            while (it3.f6887c) {
                int b14 = it3.b();
                arrayList13.add(Integer.valueOf(iArr4[b14] ^ iArr3[b14]));
            }
            return arrayList13.toArray(new Integer[0]);
        }
        if (z16 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length6 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzdc.zza(this, length6, jArr4.length);
            f c15 = h0.c1(0, length6);
            ArrayList arrayList14 = new ArrayList(j.o0(c15));
            e it4 = c15.iterator();
            while (it4.f6887c) {
                int b15 = it4.b();
                arrayList14.add(Long.valueOf(jArr3[b15] ^ jArr4[b15]));
            }
            return arrayList14.toArray(new Long[0]);
        }
        throw new zzae(4, 5, null);
    }
}
