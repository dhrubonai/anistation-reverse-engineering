package g4;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import f9.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p7.a0;
import v3.l;
import v3.n;
import x3.e0;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final x f4392f = new x(14);

    /* renamed from: g, reason: collision with root package name */
    public static final z3.c f4393g = new z3.c(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4394a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4395b;

    /* renamed from: c, reason: collision with root package name */
    public final z3.c f4396c;

    /* renamed from: d, reason: collision with root package name */
    public final x f4397d;

    /* renamed from: e, reason: collision with root package name */
    public final z3.e f4398e;

    public a(Context context, ArrayList arrayList, y3.d dVar, y3.h hVar) {
        x xVar = f4392f;
        this.f4394a = context.getApplicationContext();
        this.f4395b = arrayList;
        this.f4397d = xVar;
        this.f4398e = new z3.e(6, dVar, hVar);
        this.f4396c = f4393g;
    }

    public static int d(u3.c cVar, int i10, int i11) {
        int highestOneBit;
        int min = Math.min(cVar.f10215g / i11, cVar.f10214f / i10);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.f10214f + "x" + cVar.f10215g + "]");
        }
        return max;
    }

    @Override // v3.n
    public final e0 a(Object obj, int i10, int i11, l lVar) {
        u3.d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        z3.c cVar = this.f4396c;
        synchronized (cVar) {
            u3.d dVar2 = (u3.d) cVar.f12040a.poll();
            if (dVar2 == null) {
                dVar2 = new u3.d();
            }
            dVar = dVar2;
            dVar.f10221b = null;
            Arrays.fill(dVar.f10220a, (byte) 0);
            dVar.f10222c = new u3.c();
            dVar.f10223d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.f10221b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f10221b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return c(byteBuffer, i10, i11, dVar, lVar);
        } finally {
            this.f4396c.c(dVar);
        }
    }

    @Override // v3.n
    public final boolean b(Object obj, l lVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) lVar.c(i.f4432b)).booleanValue() && a0.F(this.f4395b, byteBuffer) == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }

    public final f4.e c(ByteBuffer byteBuffer, int i10, int i11, u3.d dVar, l lVar) {
        Bitmap.Config config;
        int i12 = p4.g.f8564b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int i13 = 2;
        try {
            u3.c b10 = dVar.b();
            if (b10.f10211c > 0 && b10.f10210b == 0) {
                if (lVar.c(i.f4431a) == v3.b.PREFER_RGB_565) {
                    try {
                        config = Bitmap.Config.RGB_565;
                    } catch (Throwable th) {
                        th = th;
                        if (Log.isLoggable("BufferGifDecoder", i13)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + p4.g.a(elapsedRealtimeNanos));
                        }
                        throw th;
                    }
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int d10 = d(b10, i10, i11);
                x xVar = this.f4397d;
                z3.e eVar = this.f4398e;
                xVar.getClass();
                u3.e eVar2 = new u3.e(eVar, b10, byteBuffer, d10);
                eVar2.c(config);
                eVar2.f10234k = (eVar2.f10234k + 1) % eVar2.f10235l.f10211c;
                Bitmap b11 = eVar2.b();
                if (b11 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + p4.g.a(elapsedRealtimeNanos));
                    }
                    return null;
                }
                f4.e eVar3 = new f4.e(new c(new b(new h(com.bumptech.glide.b.a(this.f4394a), eVar2, i10, i11, d4.c.f3228b, b11))), 1);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + p4.g.a(elapsedRealtimeNanos));
                }
                return eVar3;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + p4.g.a(elapsedRealtimeNanos));
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            i13 = 2;
        }
    }
}
