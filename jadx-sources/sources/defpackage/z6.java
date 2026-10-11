package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z6 implements q41 {
    public CipherInputStream A;
    public final q41 x;
    public final byte[] y;
    public final byte[] z;

    public z6(q41 q41Var, byte[] bArr, byte[] bArr2) {
        this.x = q41Var;
        this.y = bArr;
        this.z = bArr2;
    }

    @Override // defpackage.q41
    public final void close() {
        if (this.A != null) {
            this.A = null;
            this.x.close();
        }
    }

    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.y, "AES"), new IvParameterSpec(this.z));
                t41 t41Var = new t41(this.x, v41Var);
                this.A = new CipherInputStream(t41Var, cipher);
                t41Var.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        this.A.getClass();
        int read = this.A.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // defpackage.q41
    public final Map s() {
        return this.x.s();
    }

    @Override // defpackage.q41
    public final Uri y() {
        return this.x.y();
    }

    @Override // defpackage.q41
    public final void z(n71 n71Var) {
        n71Var.getClass();
        this.x.z(n71Var);
    }
}
