package defpackage;

import android.media.MediaCodecInfo;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class dv implements gs4 {
    public final /* synthetic */ byte x;

    @Override // defpackage.gs4
    public final boolean apply(Object obj) {
        switch (this.x) {
            case 0:
                return !((ev) obj).a.m;
            case 1:
                if (((Map.Entry) obj).getKey() == null) {
                    return false;
                }
                return true;
            case 2:
                if (((String) obj) == null) {
                    return false;
                }
                return true;
            case 3:
                cs csVar = zt1.a;
                return ((MediaCodecInfo) obj).isHardwareAccelerated();
            case 4:
                z13 z13Var = (z13) obj;
                if (!z13Var.b.equals("com.apple.iTunes") || !z13Var.c.equals("iTunSMPB")) {
                    return false;
                }
                return true;
            case 5:
                Iterator<E> it = ((rr1) obj).a.iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (((qr1) it.next()).f.a.isEmpty()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i == -1) {
                    return false;
                }
                return true;
            default:
                return !((qr1) obj).f.b.isEmpty();
        }
    }
}
