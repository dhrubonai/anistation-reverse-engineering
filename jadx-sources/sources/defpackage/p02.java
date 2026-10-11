package defpackage;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.anistation.download.service.ExternalDownloadService;
import com.anistation.model.download.external.ExternalDownloadRecord;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p02 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ List y;
    public final /* synthetic */ ExternalDownloadService z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p02(List list, ExternalDownloadService externalDownloadService, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.y = list;
        this.z = externalDownloadService;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        ExternalDownloadService externalDownloadService = this.z;
        List list = this.y;
        switch (b) {
            case 0:
                return new p02(list, externalDownloadService, vz0Var, (byte) 0);
            default:
                return new p02(list, externalDownloadService, vz0Var, (byte) 1);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((p02) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                ((p02) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object next;
        Long l;
        byte b = this.x;
        List<ExternalDownloadRecord> list = this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                ArrayList arrayList = new ArrayList(zo0.V(list, 10));
                Iterator it = list.iterator();
                while (true) {
                    long j = 0;
                    int i = 0;
                    Long l2 = null;
                    if (it.hasNext()) {
                        File file = (File) it.next();
                        int i2 = ExternalDownloadService.R;
                        if (file.exists() && file.length() != 0) {
                            MediaExtractor mediaExtractor = new MediaExtractor();
                            try {
                                mediaExtractor.setDataSource(file.getAbsolutePath());
                                Iterator it2 = db.r0(0, mediaExtractor.getTrackCount()).iterator();
                                while (true) {
                                    if (((e13) it2).z) {
                                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(((e13) it2).nextInt());
                                        trackFormat.getClass();
                                        String string = trackFormat.getString("mime");
                                        if (string != null && b06.I(string, "video/", false) && trackFormat.containsKey("durationUs")) {
                                            l = Long.valueOf(trackFormat.getLong("durationUs"));
                                        } else {
                                            l = null;
                                        }
                                        if (l != null) {
                                            l2 = l;
                                        }
                                    }
                                }
                                if (l2 != null) {
                                    j = l2.longValue();
                                }
                            } catch (Exception unused) {
                            } catch (Throwable th) {
                                mediaExtractor.release();
                                throw th;
                            }
                            mediaExtractor.release();
                        }
                        arrayList.add(new ai4(file, new Long(j)));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            if (((Number) ((ai4) obj2).y).longValue() > 0) {
                                arrayList2.add(obj2);
                            }
                        }
                        Iterator it3 = arrayList2.iterator();
                        if (!it3.hasNext()) {
                            next = null;
                        } else {
                            next = it3.next();
                            if (it3.hasNext()) {
                                long longValue = ((Number) ((ai4) next).y).longValue();
                                do {
                                    Object next2 = it3.next();
                                    long longValue2 = ((Number) ((ai4) next2).y).longValue();
                                    if (longValue < longValue2) {
                                        next = next2;
                                        longValue = longValue2;
                                    }
                                } while (it3.hasNext());
                            }
                        }
                        ai4 ai4Var = (ai4) next;
                        if (ai4Var == null) {
                            return null;
                        }
                        return (File) ai4Var.x;
                    }
                }
                break;
            default:
                m37.N(obj);
                for (ExternalDownloadRecord externalDownloadRecord : list) {
                    int i3 = ExternalDownloadService.R;
                    ExternalDownloadService externalDownloadService = this.z;
                    externalDownloadService.g().b(externalDownloadRecord.getVideoUri());
                    externalDownloadService.g().b(externalDownloadRecord.getSubtitleUri());
                    Iterator it4 = externalDownloadService.p(externalDownloadRecord.getRequest().getId()).iterator();
                    while (it4.hasNext()) {
                        ((File) it4.next()).delete();
                    }
                    externalDownloadService.h().e(externalDownloadRecord.getRequest().getId());
                }
                return pn6.a;
        }
    }
}
