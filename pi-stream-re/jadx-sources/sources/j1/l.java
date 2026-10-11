package j1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements f1.l, f1.m, f1.c, o1.p, s1.y, d2.m, d2.s, q2.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5822a;

    public /* synthetic */ l(int i10) {
        this.f5822a = i10;
    }

    public static Bitmap f(byte[] bArr, int i10) {
        int i11 = 0;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i10);
        if (decodeByteArray != null) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, i10);
                try {
                    t0.g gVar = new t0.g(byteArrayInputStream);
                    byteArrayInputStream.close();
                    t0.c c6 = gVar.c("Orientation");
                    int i12 = 1;
                    if (c6 != null) {
                        try {
                            i12 = c6.f(gVar.f9989f);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    switch (i12) {
                        case 3:
                        case 4:
                            i11 = 180;
                            break;
                        case 5:
                        case 8:
                            i11 = 270;
                            break;
                        case 6:
                        case zzaja.zze.zzg /* 7 */:
                            i11 = 90;
                            break;
                    }
                    if (i11 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i11);
                        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                    }
                    return decodeByteArray;
                } finally {
                }
            } catch (IOException e10) {
                throw new r1.d(e10);
            }
        }
        throw new r1.d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")");
    }

    @Override // o1.p
    public final void a() {
    }

    @Override // f1.c
    public final void accept(Object obj) {
        switch (this.f5822a) {
            case 4:
                ((o1.n) obj).c();
                return;
            case 5:
                ((o1.n) obj).b();
                return;
            case 6:
                ((o1.n) obj).a();
                return;
            default:
                ((v1.s0) obj).f10533b.a();
                return;
        }
    }

    @Override // f1.m
    public final void b(Object obj, c1.s sVar) {
    }

    @Override // s1.y
    public final int c(Object obj) {
        switch (this.f5822a) {
            case 10:
                Pattern pattern = s1.z.f9849a;
                String str = ((s1.n) obj).f9801a;
                if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
                    if (f1.b0.f3799a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            default:
                Pattern pattern2 = s1.z.f9849a;
                return ((s1.n) obj).f9801a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    @Override // d2.s
    public final d2.p[] d(Uri uri, Map map) {
        return e();
    }

    public final d2.p[] e() {
        return new d2.p[]{new h3.c()};
    }

    public final Constructor g() {
        switch (this.f5822a) {
            case 15:
                int[] iArr = d2.n.f3184c;
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(d2.p.class).getConstructor(Integer.TYPE);
            default:
                int[] iArr2 = d2.n.f3184c;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(d2.p.class).getConstructor(new Class[0]);
        }
    }

    @Override // f1.l
    public final void invoke(Object obj) {
        switch (this.f5822a) {
            case 1:
                int i10 = d0.f5664i0;
                ((c1.x0) obj).e(new m(2, 1003, new k0(1)));
                return;
            default:
                ((c1.x0) obj).n();
                return;
        }
    }
}
