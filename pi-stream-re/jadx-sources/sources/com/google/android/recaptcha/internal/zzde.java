package com.google.android.recaptcha.internal;

import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r6.h0;
import x6.i;
import x6.j;
import x6.o;

/* loaded from: classes.dex */
public final class zzde implements zzdd {
    public static final zzde zza = new zzde();

    private zzde() {
    }

    private static final List zzc(Object obj) {
        boolean z9 = obj instanceof byte[];
        int i10 = 0;
        o oVar = o.f11318a;
        if (z9) {
            byte[] bArr = (byte[]) obj;
            h0.u(bArr, "<this>");
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    ArrayList arrayList = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i10 < length2) {
                        arrayList.add(Byte.valueOf(bArr[i10]));
                        i10++;
                    }
                    return arrayList;
                }
                return c.L(Byte.valueOf(bArr[0]));
            }
            return oVar;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            h0.u(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    ArrayList arrayList2 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i10 < length4) {
                        arrayList2.add(Short.valueOf(sArr[i10]));
                        i10++;
                    }
                    return arrayList2;
                }
                return c.L(Short.valueOf(sArr[0]));
            }
            return oVar;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            h0.u(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    ArrayList arrayList3 = new ArrayList(iArr.length);
                    int length6 = iArr.length;
                    while (i10 < length6) {
                        arrayList3.add(Integer.valueOf(iArr[i10]));
                        i10++;
                    }
                    return arrayList3;
                }
                return c.L(Integer.valueOf(iArr[0]));
            }
            return oVar;
        }
        if (obj instanceof long[]) {
            return i.n1((long[]) obj);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            h0.u(fArr, "<this>");
            int length7 = fArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    ArrayList arrayList4 = new ArrayList(fArr.length);
                    int length8 = fArr.length;
                    while (i10 < length8) {
                        arrayList4.add(Float.valueOf(fArr[i10]));
                        i10++;
                    }
                    return arrayList4;
                }
                return c.L(Float.valueOf(fArr[0]));
            }
            return oVar;
        }
        if (!(obj instanceof double[])) {
            return null;
        }
        double[] dArr = (double[]) obj;
        h0.u(dArr, "<this>");
        int length9 = dArr.length;
        if (length9 != 0) {
            if (length9 != 1) {
                ArrayList arrayList5 = new ArrayList(dArr.length);
                int length10 = dArr.length;
                while (i10 < length10) {
                    arrayList5.add(Double.valueOf(dArr[i10]));
                    i10++;
                }
                return arrayList5;
            }
            return c.L(Double.valueOf(dArr[0]));
        }
        return oVar;
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
        List zzc = zzc(obj);
        List zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(j.o0(zzc2));
                Iterator it = zzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(j.o0(zzc));
            Iterator it2 = zzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (zzc != null && zzc2 != null) {
            zzdc.zza(this, zzc.size(), zzc2.size());
            int size = zzc.size();
            Double[] dArr = new Double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = Double.valueOf(Math.pow(((Number) zzc.get(i10)).doubleValue(), ((Number) zzc2.get(i10)).doubleValue()));
            }
            return dArr;
        }
        throw new zzae(4, 5, null);
    }
}
