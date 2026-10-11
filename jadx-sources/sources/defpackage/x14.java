package defpackage;

import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x14 implements o54 {
    public static final o15 D;
    public static final o15 E;
    public final ArrayList A;
    public final ArrayList B;
    public int C;
    public final f22 x;
    public final zp2 y;
    public final b24 z;

    static {
        z62 z62Var = nw2.y;
        Object[] objArr = {MimeTypes.VIDEO_AV1, "video/3gpp", MimeTypes.VIDEO_H264, MimeTypes.VIDEO_H265, "video/mp4v-es", "video/x-vnd.on2.vp9", "video/apv", "video/dolby-vision"};
        jf7.p(objArr, 8);
        D = nw2.j(objArr, 8);
        Object[] objArr2 = {"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb", "audio/opus", "audio/vorbis", "audio/raw", "audio/iamf"};
        jf7.p(objArr2, 7);
        E = nw2.j(objArr2, 7);
    }

    public x14(f22 f22Var) {
        this.x = f22Var;
        zp2 zp2Var = new zp2((byte) 12);
        this.y = zp2Var;
        this.z = new b24(f22Var, zp2Var, false);
        this.A = new ArrayList();
        this.B = new ArrayList();
    }

    @Override // defpackage.o54
    public final void N(ey3 ey3Var) {
        io3.m("Unsupported metadata", io3.U(ey3Var));
        this.y.n(ey3Var);
    }

    @Override // defpackage.o54
    public final void W(int i, ByteBuffer byteBuffer, ra0 ra0Var) {
        boolean z;
        ArrayList arrayList = this.A;
        boolean z2 = false;
        if (i < arrayList.size()) {
            z = true;
        } else {
            z = false;
        }
        io3.m("Track id is invalid", z);
        byteBuffer.getClass();
        int i2 = ra0Var.b;
        if (byteBuffer.remaining() == i2) {
            z2 = true;
        }
        io3.n(z2);
        tg6 tg6Var = (tg6) arrayList.get(i);
        try {
            if (!this.B.contains(tg6Var)) {
                this.z.h(tg6Var, byteBuffer, ra0Var);
                return;
            }
            throw null;
        } catch (IOException e) {
            throw new Exception("Failed to write sample for presentationTimeUs=" + ra0Var.a + ", size=" + i2, e);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Exception exc;
        try {
            b24 b24Var = this.z;
            io3.K(0L);
            b24Var.b();
            exc = null;
        } catch (IOException e) {
            exc = new Exception("Failed to finish writing data", e);
        }
        try {
            this.x.close();
        } catch (IOException e2) {
            if (exc == null) {
                exc = new Exception("Failed to close output stream", e2);
            } else {
                kb0.t("Mp4Muxer", "Failed to close output stream", e2);
            }
        }
        if (exc == null) {
        } else {
            throw exc;
        }
    }

    @Override // defpackage.o54
    public final int n0(ea2 ea2Var) {
        int i = this.C;
        this.C = i + 1;
        b24 b24Var = this.z;
        tg6 tg6Var = new tg6(i, ea2Var, b24Var.c);
        ArrayList arrayList = b24Var.d;
        arrayList.add(tg6Var);
        Collections.sort(arrayList, new be((byte) 18));
        this.A.add(tg6Var);
        return i;
    }
}
