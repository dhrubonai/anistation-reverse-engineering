package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

/* loaded from: classes.dex */
class zzbe extends zzbf {
    final zzbb zzb;
    final Character zzc;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzbe(com.google.android.gms.internal.fido.zzbb r4, java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.zzb = r4
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L17
            r5.charValue()
            r2 = 61
            boolean r4 = r4.zzb(r2)
            if (r4 != 0) goto L15
            goto L17
        L15:
            r4 = r0
            goto L18
        L17:
            r4 = r1
        L18:
            if (r4 == 0) goto L1d
            r3.zzc = r5
            return
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "Padding character %s was already in alphabet"
            java.lang.String r5 = com.google.android.gms.internal.fido.zzan.zza(r5, r1)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzbe.<init>(com.google.android.gms.internal.fido.zzbb, java.lang.Character):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzb.equals(zzbeVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzbeVar.zzc;
                if (ch != ch2) {
                    if (ch != null && ch.equals(ch2)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zzb.hashCode();
        Character ch = this.zzc;
        if (ch == null) {
            hashCode = 0;
        } else {
            hashCode = ch.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    public void zza(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzam.zze(0, i11, bArr.length);
        while (i12 < i11) {
            zzc(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    public final int zzb(int i10) {
        zzbb zzbbVar = this.zzb;
        return zzbh.zza(i10, zzbbVar.zzd, RoundingMode.CEILING) * zzbbVar.zzc;
    }

    public final void zzc(Appendable appendable, byte[] bArr, int i10, int i11) {
        boolean z9;
        zzam.zze(i10, i10 + i11, bArr.length);
        int i12 = 0;
        if (i11 <= this.zzb.zzd) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzam.zzc(z9);
        long j4 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j4 = (j4 | (bArr[i10 + i13] & 255)) << 8;
        }
        int i14 = ((i11 + 1) * 8) - this.zzb.zzb;
        while (i12 < i11 * 8) {
            zzbb zzbbVar = this.zzb;
            appendable.append(zzbbVar.zza(zzbbVar.zza & ((int) (j4 >>> (i14 - i12)))));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i12 += this.zzb.zzb;
            }
        }
    }

    public zzbe(String str, String str2, Character ch) {
        this(new zzbb(str, str2.toCharArray()), ch);
    }
}
