package p1;

import android.net.Uri;
import h1.e0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class a implements h1.h {

    /* renamed from: a, reason: collision with root package name */
    public final h1.h f8419a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8420b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8421c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f8422d;

    public a(h1.h hVar, byte[] bArr, byte[] bArr2) {
        this.f8419a = hVar;
        this.f8420b = bArr;
        this.f8421c = bArr2;
    }

    @Override // h1.h
    public final void close() {
        if (this.f8422d != null) {
            this.f8422d = null;
            this.f8419a.close();
        }
    }

    @Override // h1.h
    public final Map e() {
        return this.f8419a.e();
    }

    @Override // h1.h
    public final void f(e0 e0Var) {
        e0Var.getClass();
        this.f8419a.f(e0Var);
    }

    @Override // h1.h
    public final Uri j() {
        return this.f8419a.j();
    }

    @Override // h1.h
    public final long m(h1.l lVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f8420b, "AES"), new IvParameterSpec(this.f8421c));
                h1.j jVar = new h1.j(this.f8419a, lVar);
                this.f8422d = new CipherInputStream(jVar, cipher);
                jVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // c1.l
    public final int p(byte[] bArr, int i10, int i11) {
        this.f8422d.getClass();
        int read = this.f8422d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
