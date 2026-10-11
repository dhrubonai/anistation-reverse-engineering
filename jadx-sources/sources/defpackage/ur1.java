package defpackage;

import android.hardware.DataSpace;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import android.media.metrics.MediaItemInfo;
import android.os.SystemClock;
import android.util.Size;
import android.util.SparseIntArray;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ur1 {
    public static final SparseIntArray f;
    public static final SparseIntArray g;
    public static final SparseIntArray h;
    public static final SparseIntArray i;
    public final long a = SystemClock.elapsedRealtime();
    public final boolean b;
    public final boolean c;
    public final String d;
    public final tr1 e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        g = sparseIntArray2;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        h = sparseIntArray3;
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        i = sparseIntArray4;
        sparseIntArray.put(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 1);
        sparseIntArray.put(1001, 2);
        sparseIntArray.put(2000, 3);
        sparseIntArray.put(2001, 4);
        sparseIntArray.put(2002, 5);
        sparseIntArray.put(2003, 3);
        sparseIntArray.put(2004, 6);
        sparseIntArray.put(2005, 7);
        sparseIntArray.put(2006, 8);
        sparseIntArray.put(2007, 9);
        sparseIntArray.put(2008, 10);
        sparseIntArray.put(3001, 11);
        sparseIntArray.put(3002, 12);
        sparseIntArray.put(3003, 13);
        sparseIntArray.put(4001, 14);
        sparseIntArray.put(4002, 15);
        sparseIntArray.put(4003, 16);
        sparseIntArray.put(5001, 17);
        sparseIntArray.put(6001, 18);
        sparseIntArray.put(7001, 19);
        sparseIntArray.put(7002, 2);
        sparseIntArray2.put(-1, 0);
        sparseIntArray2.put(2, 131072);
        sparseIntArray2.put(1, 65536);
        sparseIntArray2.put(6, 393216);
        sparseIntArray3.put(-1, 0);
        sparseIntArray3.put(2, 268435456);
        sparseIntArray3.put(1, 134217728);
        sparseIntArray4.put(-1, 0);
        sparseIntArray4.put(1, 4194304);
        sparseIntArray4.put(3, 12582912);
        sparseIntArray4.put(2, 8388608);
        sparseIntArray4.put(10, 16777216);
        sparseIntArray4.put(6, 29360128);
        sparseIntArray4.put(7, 33554432);
    }

    public ur1(tr1 tr1Var, String str, boolean z, boolean z2) {
        this.e = tr1Var;
        this.d = str;
        this.b = z;
        this.c = z2;
    }

    public static long b(String str) {
        long j;
        if (qy3.i(str)) {
            j = 4;
        } else {
            j = 0;
        }
        if (qy3.m(str)) {
            j |= 2;
        }
        if (qy3.k(str)) {
            return j | 1;
        }
        return j;
    }

    public static ArrayList c(nw2 nw2Var) {
        MediaItemInfo build;
        int pack;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < nw2Var.size(); i2++) {
            rz1 rz1Var = (rz1) nw2Var.get(i2);
            MediaItemInfo.Builder d = bu.d();
            d.setClipDurationMillis(eq6.l0(rz1Var.a));
            String str = rz1Var.e;
            if (str != null) {
                d.addCodecName(str);
            }
            String str2 = rz1Var.d;
            if (str2 != null) {
                d.addCodecName(str2);
            }
            ea2 ea2Var = rz1Var.c;
            if (ea2Var != null) {
                String str3 = ea2Var.p;
                String str4 = ea2Var.o;
                if (str4 != null) {
                    d.setContainerMimeType(str4);
                }
                if (str3 != null) {
                    d.addSampleMimeType(str3);
                    d.addDataType(b(str3));
                }
                float f2 = ea2Var.B;
                if (f2 != -1.0f) {
                    d.setVideoFrameRate(f2);
                }
                int i3 = ea2Var.w;
                if (i3 == -1) {
                    i3 = -1;
                }
                int i4 = ea2Var.x;
                if (i4 == -1) {
                    i4 = -1;
                }
                d.setVideoSize(new Size(i3, i4));
                hp0 hp0Var = ea2Var.H;
                if (hp0Var != null) {
                    pack = DataSpace.pack(g.get(hp0Var.a, 0), i.get(hp0Var.c, 0), h.get(hp0Var.b, 0));
                    d.setVideoDataSpace(pack);
                }
            }
            ea2 ea2Var2 = rz1Var.b;
            if (ea2Var2 != null) {
                String str5 = ea2Var2.p;
                if (str5 != null) {
                    d.addSampleMimeType(str5);
                    d.addDataType(b(str5));
                }
                int i5 = ea2Var2.J;
                if (i5 != -1) {
                    d.setAudioChannelCount(i5);
                }
                int i6 = ea2Var2.L;
                if (i6 != -1) {
                    d.setAudioSampleRateHz(i6);
                }
            }
            build = d.build();
            arrayList.add(build);
        }
        return arrayList;
    }

    public static MediaItemInfo d(sz1 sz1Var) {
        int pack;
        MediaItemInfo.Builder d = bu.d();
        long j = sz1Var.a;
        String str = sz1Var.n;
        String str2 = sz1Var.g;
        if (j != -9223372036854775807L) {
            d.setDurationMillis(j);
        }
        if (str2 != null) {
            d.addSampleMimeType(str2);
            d.addDataType(b(str2));
        }
        if (str != null) {
            d.addSampleMimeType(str);
            d.addDataType(b(str));
        }
        int i2 = sz1Var.d;
        int i3 = -1;
        if (i2 != -1) {
            d.setAudioChannelCount(i2);
        }
        int i4 = sz1Var.e;
        if (i4 != -2147483647) {
            d.setAudioSampleRateHz(i4);
        }
        String str3 = sz1Var.f;
        if (str3 != null) {
            d.addCodecName(str3);
        }
        String str4 = sz1Var.m;
        if (str4 != null) {
            d.addCodecName(str4);
        }
        d.setVideoSampleCount(sz1Var.l);
        int i5 = sz1Var.k;
        if (i5 == -1) {
            i5 = -1;
        }
        int i6 = sz1Var.j;
        if (i6 != -1) {
            i3 = i6;
        }
        d.setVideoSize(new Size(i5, i3));
        hp0 hp0Var = sz1Var.i;
        if (hp0Var != null) {
            pack = DataSpace.pack(g.get(hp0Var.a, 0), i.get(hp0Var.c, 0), h.get(hp0Var.b, 0));
            d.setVideoDataSpace(pack);
        }
        return d.build();
    }

    public final EditingEndedEvent.Builder a(int i2) {
        EditingEndedEvent.Builder exporterName = new EditingEndedEvent.Builder(i2).setTimeSinceCreatedMillis(SystemClock.elapsedRealtime() - this.a).setExporterName("androidx.media3:media3-transformer:1.11.1");
        String str = this.d;
        if (str != null) {
            exporterName.setMuxerName(str);
        }
        return exporterName;
    }

    public final void e(int i2) {
        EditingEndedEvent build;
        EditingSession editingSession;
        EditingEndedEvent.Builder a = a(2);
        if (i2 != -1) {
            a.setFinalProgressPercent(i2);
        }
        if (this.b) {
            a.addOperationType(8L);
        }
        if (this.c) {
            a.addOperationType(4L);
        }
        build = a.build();
        tr1 tr1Var = this.e;
        if (!tr1Var.y && (editingSession = tr1Var.x) != null) {
            editingSession.reportEditingEndedEvent(build);
            tr1Var.y = true;
        }
        try {
            h11.A(tr1Var);
        } catch (Exception e) {
            kb0.t("EditingMetricsCollector", "error while closing the metrics reporter", e);
        }
    }

    public final void f(EditingEndedEvent.Builder builder, sz1 sz1Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        nw2 nw2Var = sz1Var.q;
        if (z) {
            builder.addOperationType(128L);
        }
        Iterator<E> it = nw2Var.iterator();
        boolean z5 = false;
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((rz1) it.next()).b != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<E> it2 = nw2Var.iterator();
        int i3 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (((rz1) it2.next()).c != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            z5 = true;
        }
        if (z2) {
            if (sz1Var.f != null) {
                builder.addOperationType(2L);
            } else {
                builder.addOperationType(32L);
            }
        }
        if (z5) {
            if (sz1Var.m != null) {
                builder.addOperationType(1L);
            } else {
                builder.addOperationType(16L);
            }
        }
        if (this.b) {
            builder.addOperationType(8L);
        }
        if (this.c) {
            builder.addOperationType(4L);
        }
    }
}
