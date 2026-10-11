package e4;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 implements v3.n {

    /* renamed from: d, reason: collision with root package name */
    public static final v3.k f3482d = new v3.k("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new c0(0));

    /* renamed from: e, reason: collision with root package name */
    public static final v3.k f3483e = new v3.k("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new c0(1));

    /* renamed from: f, reason: collision with root package name */
    public static final f9.x f3484f = new f9.x(12);

    /* renamed from: g, reason: collision with root package name */
    public static final List f3485g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    public final e0 f3486a;

    /* renamed from: b, reason: collision with root package name */
    public final y3.d f3487b;

    /* renamed from: c, reason: collision with root package name */
    public final f9.x f3488c = f3484f;

    public f0(y3.d dVar, f9.x xVar) {
        this.f3487b = dVar;
        this.f3486a = xVar;
    }

    @Override // v3.n
    public final x3.e0 a(Object obj, int i10, int i11, v3.l lVar) {
        int i12;
        MediaMetadataRetriever mediaMetadataRetriever;
        long longValue = ((Long) lVar.c(f3482d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(a3.g.q("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) lVar.c(f3483e);
        if (num == null) {
            num = 2;
        }
        n nVar = (n) lVar.c(n.f3501f);
        if (nVar == null) {
            nVar = n.f3500e;
        }
        n nVar2 = nVar;
        this.f3488c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
        try {
            switch (((f9.x) this.f3486a).f4108a) {
                case 10:
                    AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                    mediaMetadataRetriever2.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    mediaMetadataRetriever2.setDataSource(new d0((ByteBuffer) obj));
                    break;
                default:
                    mediaMetadataRetriever2.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                    break;
            }
            i12 = 29;
            mediaMetadataRetriever = mediaMetadataRetriever2;
            try {
                Bitmap c6 = c(obj, mediaMetadataRetriever2, longValue, num.intValue(), i10, i11, nVar2);
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.release();
                } else {
                    mediaMetadataRetriever.release();
                }
                return d.c(c6, this.f3487b);
            } catch (Throwable th) {
                th = th;
                if (Build.VERSION.SDK_INT >= i12) {
                    mediaMetadataRetriever.release();
                } else {
                    mediaMetadataRetriever.release();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i12 = 29;
            mediaMetadataRetriever = mediaMetadataRetriever2;
        }
    }

    @Override // v3.n
    public final boolean b(Object obj, v3.l lVar) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0144, code lost:
    
        if (r0 < 33) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap c(java.lang.Object r21, android.media.MediaMetadataRetriever r22, long r23, int r25, int r26, int r27, e4.n r28) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.f0.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, e4.n):android.graphics.Bitmap");
    }
}
