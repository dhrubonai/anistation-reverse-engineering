package com.google.android.recaptcha.internal;

import java.util.Collection;
import o7.a;
import r6.h0;
import x6.m;

/* loaded from: classes.dex */
public final class zzcv implements zzdd {
    public static final zzcv zza = new zzcv();

    private zzcv() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        String r02;
        String str;
        if (zzpqVarArr.length == 1) {
            int i11 = 0;
            Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof int[]) {
                    int[] iArr = (int[]) zza2;
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int length = iArr.length;
                    int i12 = 0;
                    while (i11 < length) {
                        int i13 = iArr[i11];
                        i12++;
                        if (i12 > 1) {
                            sb.append((CharSequence) ",");
                        }
                        sb.append((CharSequence) String.valueOf(i13));
                        i11++;
                    }
                    sb.append((CharSequence) "]");
                    r02 = sb.toString();
                    h0.s(r02, "toString(...)");
                } else {
                    if (zza2 instanceof byte[]) {
                        str = new String((byte[]) zza2, a.f8311a);
                    } else if (zza2 instanceof long[]) {
                        long[] jArr = (long[]) zza2;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((CharSequence) "[");
                        int length2 = jArr.length;
                        int i14 = 0;
                        while (i11 < length2) {
                            long j4 = jArr[i11];
                            i14++;
                            if (i14 > 1) {
                                sb2.append((CharSequence) ",");
                            }
                            sb2.append((CharSequence) String.valueOf(j4));
                            i11++;
                        }
                        sb2.append((CharSequence) "]");
                        r02 = sb2.toString();
                        h0.s(r02, "toString(...)");
                    } else if (zza2 instanceof short[]) {
                        short[] sArr = (short[]) zza2;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append((CharSequence) "[");
                        int length3 = sArr.length;
                        int i15 = 0;
                        while (i11 < length3) {
                            short s9 = sArr[i11];
                            i15++;
                            if (i15 > 1) {
                                sb3.append((CharSequence) ",");
                            }
                            sb3.append((CharSequence) String.valueOf((int) s9));
                            i11++;
                        }
                        sb3.append((CharSequence) "]");
                        r02 = sb3.toString();
                        h0.s(r02, "toString(...)");
                    } else if (zza2 instanceof float[]) {
                        float[] fArr = (float[]) zza2;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append((CharSequence) "[");
                        int length4 = fArr.length;
                        int i16 = 0;
                        while (i11 < length4) {
                            float f10 = fArr[i11];
                            i16++;
                            if (i16 > 1) {
                                sb4.append((CharSequence) ",");
                            }
                            sb4.append((CharSequence) String.valueOf(f10));
                            i11++;
                        }
                        sb4.append((CharSequence) "]");
                        r02 = sb4.toString();
                        h0.s(r02, "toString(...)");
                    } else if (zza2 instanceof double[]) {
                        double[] dArr = (double[]) zza2;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append((CharSequence) "[");
                        int length5 = dArr.length;
                        int i17 = 0;
                        while (i11 < length5) {
                            double d10 = dArr[i11];
                            i17++;
                            if (i17 > 1) {
                                sb5.append((CharSequence) ",");
                            }
                            sb5.append((CharSequence) String.valueOf(d10));
                            i11++;
                        }
                        sb5.append((CharSequence) "]");
                        r02 = sb5.toString();
                        h0.s(r02, "toString(...)");
                    } else if (zza2 instanceof char[]) {
                        str = new String((char[]) zza2);
                    } else if (zza2 instanceof Object[]) {
                        Object[] objArr = (Object[]) zza2;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append((CharSequence) "[");
                        int length6 = objArr.length;
                        int i18 = 0;
                        while (i11 < length6) {
                            Object obj = objArr[i11];
                            i18++;
                            if (i18 > 1) {
                                sb6.append((CharSequence) ",");
                            }
                            h0.f(sb6, obj, null);
                            i11++;
                        }
                        sb6.append((CharSequence) "]");
                        r02 = sb6.toString();
                        h0.s(r02, "toString(...)");
                    } else if (zza2 instanceof Collection) {
                        r02 = m.r0((Iterable) zza2, ",", "[", "]", null, 56);
                    } else {
                        throw new zzae(4, 5, null);
                    }
                    r02 = str;
                }
                zzcjVar.zzc().zzf(i10, r02);
                return;
            }
            throw new zzae(4, 5, null);
        }
        throw new zzae(4, 3, null);
    }
}
