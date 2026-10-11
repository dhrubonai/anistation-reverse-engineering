package defpackage;

import android.content.res.AssetFileDescriptor;
import androidx.work.impl.WorkDatabase;
import com.discord.org.webrtc.TextureBufferImpl;
import com.discord.org.webrtc.VideoFrame;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class iu2 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iu2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        int i2;
        VideoFrame.I420Buffer lambda$toI420$1;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                WorkDatabase workDatabase = ((ju2) obj).a;
                Long longValue = workDatabase.preferenceDao().getLongValue("next_job_scheduler_id");
                int i3 = 0;
                if (longValue != null) {
                    i = (int) longValue.longValue();
                } else {
                    i = 0;
                }
                if (i == Integer.MAX_VALUE) {
                    i2 = 0;
                } else {
                    i2 = i + 1;
                }
                workDatabase.preferenceDao().insertPreference(new ns4("next_job_scheduler_id", Long.valueOf(i2)));
                if (i >= 0 && i <= Integer.MAX_VALUE) {
                    i3 = i;
                } else {
                    workDatabase.preferenceDao().insertPreference(new ns4("next_job_scheduler_id", 1L));
                }
                return Integer.valueOf(i3);
            case 1:
                return (AssetFileDescriptor) obj;
            default:
                lambda$toI420$1 = ((TextureBufferImpl) obj).lambda$toI420$1();
                return lambda$toI420$1;
        }
    }
}
