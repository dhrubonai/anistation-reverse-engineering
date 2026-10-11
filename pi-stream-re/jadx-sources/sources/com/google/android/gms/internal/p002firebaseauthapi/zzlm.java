package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzlm extends zzna<zzuo, zzut> {
    private final /* synthetic */ zzlk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlm(zzlk zzlkVar, Class cls) {
        super(cls);
        this.zza = zzlkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzna
    public final /* synthetic */ zzut zza(zzuo zzuoVar) {
        byte[] zza;
        byte[] zza2;
        zzuo zzuoVar2 = zzuoVar;
        zzum zzc = zzuoVar2.zzc().zzc();
        int i10 = zzll.zza[zzc.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                throw new GeneralSecurityException("Invalid KEM");
            }
            zzwq zzc2 = zzlq.zzc(zzuoVar2.zzc().zzc());
            ECParameterSpec zza3 = zzwn.zza(zzc2);
            KeyPairGenerator zza4 = zzwr.zzd.zza("EC");
            zza4.initialize(zza3);
            KeyPair generateKeyPair = zza4.generateKeyPair();
            zzwp zzwpVar = zzwp.UNCOMPRESSED;
            ECPoint w9 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
            EllipticCurve curve = zzwn.zza(zzc2).getCurve();
            zzmd.zza(w9, curve);
            int zza5 = zzwn.zza(curve);
            int ordinal = zzwpVar.ordinal();
            if (ordinal == 0) {
                int i11 = (zza5 * 2) + 1;
                byte[] bArr = new byte[i11];
                byte[] zza6 = zzmb.zza(w9.getAffineX());
                byte[] zza7 = zzmb.zza(w9.getAffineY());
                System.arraycopy(zza7, 0, bArr, i11 - zza7.length, zza7.length);
                System.arraycopy(zza6, 0, bArr, (zza5 + 1) - zza6.length, zza6.length);
                bArr[0] = 4;
                zza2 = bArr;
            } else if (ordinal == 1) {
                int i12 = zza5 + 1;
                zza2 = new byte[i12];
                byte[] zza8 = zzmb.zza(w9.getAffineX());
                System.arraycopy(zza8, 0, zza2, i12 - zza8.length, zza8.length);
                zza2[0] = (byte) (w9.getAffineY().testBit(0) ? 3 : 2);
            } else if (ordinal == 2) {
                int i13 = zza5 * 2;
                zza2 = new byte[i13];
                byte[] zza9 = zzmb.zza(w9.getAffineX());
                if (zza9.length > zza5) {
                    zza9 = Arrays.copyOfRange(zza9, zza9.length - zza5, zza9.length);
                }
                byte[] zza10 = zzmb.zza(w9.getAffineY());
                if (zza10.length > zza5) {
                    zza10 = Arrays.copyOfRange(zza10, zza10.length - zza5, zza10.length);
                }
                System.arraycopy(zza10, 0, zza2, i13 - zza10.length, zza10.length);
                System.arraycopy(zza9, 0, zza2, zza5 - zza9.length, zza9.length);
            } else {
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(zzwpVar)));
            }
            zza = zzmb.zza(((ECPrivateKey) generateKeyPair.getPrivate()).getS(), zzlq.zza(zzc));
        } else {
            zza = zzov.zza(32);
            zza[0] = (byte) (zza[0] | 7);
            byte b10 = (byte) (zza[31] & 63);
            zza[31] = b10;
            zza[31] = (byte) (b10 | 128);
            zza2 = zzxp.zza(zza);
        }
        return (zzut) ((zzaja) zzut.zzb().zza(0).zza((zzuw) ((zzaja) zzuw.zzc().zza(0).zza(zzuoVar2.zzc()).zza(zzahm.zza(zza2)).zzf())).zza(zzahm.zza(zza)).zzf());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzna
    public final /* synthetic */ void zzb(zzuo zzuoVar) {
        zzlq.zza(zzuoVar.zzc());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzna
    public final /* synthetic */ zzuo zza(zzahm zzahmVar) {
        return zzuo.zza(zzahmVar, zzaip.zza());
    }
}
