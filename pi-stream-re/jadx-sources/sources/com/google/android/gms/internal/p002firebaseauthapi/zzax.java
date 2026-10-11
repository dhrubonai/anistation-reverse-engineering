package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzax<K, V> extends zzau<K, V> {
    private static final zzau<Object, Object> zza = new zzax(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzax(Object obj, Object[] objArr, int i10) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.zzb
            java.lang.Object[] r1 = r8.zzc
            int r2 = r8.zzd
            r3 = 0
            if (r9 != 0) goto Lc
        L9:
            r9 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L9
            r9 = r1[r4]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L50
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzam.zza(r0)
        L37:
            r0 = r0 & r5
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L9
        L40:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L4d:
            int r0 = r0 + 1
            goto L37
        L50:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7c
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzam.zza(r0)
        L62:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L9
        L6c:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L79:
            int r0 = r0 + 1
            goto L62
        L7c:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = com.google.android.gms.internal.p002firebaseauthapi.zzam.zza(r5)
        L88:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L9
        L90:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r3
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzax.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    public final zzal<V> zza() {
        return new zzbb(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    public final zzav<Map.Entry<K, V>> zzb() {
        return new zzba(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    public final zzav<K> zzc() {
        return new zzbc(this, new zzbb(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    public final boolean zzd() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static <K, V> zzax<K, V> zza(int i10, Object[] objArr, zzat<K, V> zzatVar) {
        int i11;
        short[] sArr;
        char c6;
        char c10;
        int i12 = i10;
        Object[] objArr2 = objArr;
        if (i12 == 0) {
            return (zzax) zza;
        }
        Object obj = null;
        int i13 = 1;
        if (i12 == 1) {
            Object obj2 = objArr2[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr2[1];
            Objects.requireNonNull(obj3);
            zzaj.zza(obj2, obj3);
            return new zzax<>(null, objArr2, 1);
        }
        zzz.zzb(i12, objArr2.length >> 1);
        int max = Math.max(i12, 2);
        if (max < 751619276) {
            i11 = Integer.highestOneBit(max - 1) << 1;
            while (i11 * 0.7d < max) {
                i11 <<= 1;
            }
        } else {
            i11 = 1073741824;
            if (!(max < 1073741824)) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i12 == 1) {
            Object obj4 = objArr2[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr2[1];
            Objects.requireNonNull(obj5);
            zzaj.zza(obj4, obj5);
            c6 = 1;
            c10 = 2;
        } else {
            int i14 = i11 - 1;
            char c11 = 65535;
            if (i11 <= 128) {
                byte[] bArr = new byte[i11];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i15 * 2;
                    int i18 = i16 * 2;
                    Object obj6 = objArr2[i17];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr2[i17 ^ i13];
                    Objects.requireNonNull(obj7);
                    zzaj.zza(obj6, obj7);
                    int zza2 = zzam.zza(obj6.hashCode());
                    while (true) {
                        int i19 = zza2 & i14;
                        int i20 = bArr[i19] & 255;
                        if (i20 == 255) {
                            bArr[i19] = (byte) i18;
                            if (i16 < i15) {
                                objArr2[i18] = obj6;
                                objArr2[i18 ^ 1] = obj7;
                            }
                            i16++;
                        } else {
                            if (obj6.equals(objArr2[i20])) {
                                int i21 = i20 ^ 1;
                                Object obj8 = objArr2[i21];
                                Objects.requireNonNull(obj8);
                                obj = new zzaw(obj6, obj7, obj8);
                                objArr2[i21] = obj7;
                                break;
                            }
                            zza2 = i19 + 1;
                        }
                    }
                    i15++;
                    i13 = 1;
                }
                if (i16 == i12) {
                    obj = bArr;
                    c10 = 2;
                    c6 = 1;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i16), obj};
                    c10 = 2;
                    c6 = 1;
                }
            } else {
                if (i11 <= 32768) {
                    sArr = new short[i11];
                    Arrays.fill(sArr, (short) -1);
                    int i22 = 0;
                    for (int i23 = 0; i23 < i12; i23++) {
                        int i24 = i23 * 2;
                        int i25 = i22 * 2;
                        Object obj9 = objArr2[i24];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr2[i24 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzaj.zza(obj9, obj10);
                        int zza3 = zzam.zza(obj9.hashCode());
                        while (true) {
                            int i26 = zza3 & i14;
                            int i27 = sArr[i26] & 65535;
                            if (i27 == 65535) {
                                sArr[i26] = (short) i25;
                                if (i22 < i23) {
                                    objArr2[i25] = obj9;
                                    objArr2[i25 ^ 1] = obj10;
                                }
                                i22++;
                            } else {
                                if (obj9.equals(objArr2[i27])) {
                                    int i28 = i27 ^ 1;
                                    Object obj11 = objArr2[i28];
                                    Objects.requireNonNull(obj11);
                                    obj = new zzaw(obj9, obj10, obj11);
                                    objArr2[i28] = obj10;
                                    break;
                                }
                                zza3 = i26 + 1;
                            }
                        }
                    }
                    if (i22 != i12) {
                        c10 = 2;
                        obj = new Object[]{sArr, Integer.valueOf(i22), obj};
                        c6 = 1;
                    }
                } else {
                    sArr = new int[i11];
                    Arrays.fill((int[]) sArr, -1);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < i12) {
                        int i31 = i29 * 2;
                        int i32 = i30 * 2;
                        Object obj12 = objArr2[i31];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr2[i31 ^ 1];
                        Objects.requireNonNull(obj13);
                        zzaj.zza(obj12, obj13);
                        int zza4 = zzam.zza(obj12.hashCode());
                        while (true) {
                            int i33 = zza4 & i14;
                            ?? r15 = sArr[i33];
                            if (r15 == c11) {
                                sArr[i33] = i32;
                                if (i30 < i29) {
                                    objArr2[i32] = obj12;
                                    objArr2[i32 ^ 1] = obj13;
                                }
                                i30++;
                            } else {
                                if (obj12.equals(objArr2[r15])) {
                                    int i34 = r15 ^ 1;
                                    Object obj14 = objArr2[i34];
                                    Objects.requireNonNull(obj14);
                                    obj = new zzaw(obj12, obj13, obj14);
                                    objArr2[i34] = obj13;
                                    break;
                                }
                                zza4 = i33 + 1;
                                c11 = 65535;
                            }
                        }
                        i29++;
                        c11 = 65535;
                    }
                    if (i30 != i12) {
                        c6 = 1;
                        c10 = 2;
                        obj = new Object[]{sArr, Integer.valueOf(i30), obj};
                    }
                }
                obj = sArr;
                c10 = 2;
                c6 = 1;
            }
        }
        boolean z9 = obj instanceof Object[];
        Object obj15 = obj;
        if (z9) {
            Object[] objArr3 = (Object[]) obj;
            zzaw zzawVar = (zzaw) objArr3[c10];
            if (zzatVar != null) {
                zzatVar.zza = zzawVar;
                Object obj16 = objArr3[0];
                int intValue = ((Integer) objArr3[c6]).intValue();
                objArr2 = Arrays.copyOf(objArr2, intValue << 1);
                obj15 = obj16;
                i12 = intValue;
            } else {
                throw zzawVar.zza();
            }
        }
        return new zzax<>(obj15, objArr2, i12);
    }
}
