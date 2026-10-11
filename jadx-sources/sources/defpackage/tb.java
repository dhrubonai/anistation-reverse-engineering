package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.discord.org.webrtc.EglBase;
import com.discord.org.webrtc.EglThread;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tb implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        EglBase.EglConnection lambda$create$0;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return AndroidDiagnosticEventRepository.a((AndroidDiagnosticEventRepository) obj2, (List) obj);
            case 1:
                r41 r41Var = (r41) obj2;
                byte[] bArr = (byte[]) obj;
                return oi4.m(bArr, bArr.length, r41Var.z, r41Var.A);
            case 2:
                r41 r41Var2 = (r41) obj2;
                Uri uri = (Uri) obj;
                q41 H = r41Var2.y.H();
                BitmapFactory.Options options = r41Var2.z;
                int i = r41Var2.A;
                try {
                    v41 v41Var = new v41(uri, 0L, -1L);
                    s71 s71Var = (s71) H;
                    s71Var.h(v41Var);
                    byte[] bArr2 = new byte[1024];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 != -1) {
                        if (i3 == bArr2.length) {
                            bArr2 = Arrays.copyOf(bArr2, bArr2.length * 2);
                        }
                        i2 = s71Var.read(bArr2, i3, bArr2.length - i3);
                        if (i2 != -1) {
                            i3 += i2;
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr2, i3);
                    Bitmap m = oi4.m(copyOf, copyOf.length, options, i);
                    s71Var.close();
                    return m;
                } catch (Throwable th) {
                    ((s71) H).close();
                    throw th;
                }
            default:
                lambda$create$0 = EglThread.lambda$create$0((EglBase.Context) obj2, (int[]) obj);
                return lambda$create$0;
        }
    }
}
