package defpackage;

import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class an7 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ an7(byte b) {
        this.a = b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 770
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r42) {
        /*
            Method dump skipped, instructions count: 2808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an7.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MediaInfo[i];
            case 1:
                return new er3[i];
            case 2:
                return new gr3[i];
            case 3:
                return new ir3[i];
            case 4:
                return new sr3[i];
            case 5:
                return new tr3[i];
            case 6:
                return new ur3[i];
            case 7:
                return new bx3[i];
            case 8:
                return new hr0[i];
            case 9:
                return new s5[i];
            case 10:
                return new MediaTrack[i];
            case 11:
                return new Scope[i];
            case 12:
                return new mr[i];
            case 13:
                return new so7[i];
            case 14:
                return new to7[i];
            case 15:
                return new ce6[i];
            case 16:
                return new zq6[i];
            case 17:
                return new it6[i];
            case 18:
                return new Status[i];
            case 19:
                return new iq7[i];
            case 20:
                return new kq7[i];
            case 21:
                return new lq7[i];
            case 22:
                return new rq7[i];
            case 23:
                return new fr7[i];
            case 24:
                return new tu2[i];
            case 25:
                return new BinderWrapper[i];
            case 26:
                return new qv7[i];
            case 27:
                return new sv7[i];
            case 28:
                return new vv7[i];
            default:
                return new yv7[i];
        }
    }
}
