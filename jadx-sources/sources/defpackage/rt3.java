package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class rt3 implements uo1, p60, oe2, vs1, tf0, jm2, gg5, r03 {
    public static final String[] A = {MediationMetaData.KEY_NAME, "length", "last_touch_timestamp"};
    public final /* synthetic */ byte x;
    public Object y;
    public Object z;

    public rt3(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        mt3 mt3Var;
        int i;
        this.x = (byte) 0;
        ComponentName componentName2 = null;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i2 = s46.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else if (queryBroadcastReceivers.size() > 1) {
                    kb0.O("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                componentName = componentName2;
                if (componentName == null) {
                    kb0.B("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                if (Build.VERSION.SDK_INT >= 31) {
                    i = 33554432;
                } else {
                    i = 0;
                }
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, i);
            }
            if (Build.VERSION.SDK_INT >= 37) {
                mt3Var = new mt3(context, str, bundle);
                this.y = mt3Var;
            } else {
                mt3Var = new mt3(context, str, bundle);
                this.y = mt3Var;
            }
            Looper myLooper = Looper.myLooper();
            H(new jt3((byte) 0), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            mt3Var.a.setMediaButtonReceiver(pendingIntent);
            this.z = new sn3(context, this);
            return;
        }
        ze0.k("tag must not be null or empty");
        throw null;
    }

    public static rt3 d(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e) {
                e = e;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e2) {
            e = e2;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new rt3((Object) fileChannel, (Object) fileLock, (byte) 13);
        } catch (IOException | Error | OverlappingFileLockException e3) {
            e = e3;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [st3, java.lang.Object] */
    @Override // defpackage.p60
    public ii3 A(jr3 jr3Var) {
        Uri uri;
        byte[] bArr;
        st3 st3Var = (st3) this.z;
        if (st3Var != null && (((uri = (Uri) st3Var.y) != null && uri.equals(jr3Var.n)) || ((bArr = (byte[]) st3Var.x) != null && Arrays.equals(bArr, jr3Var.k)))) {
            ii3 ii3Var = (ii3) ((st3) this.z).z;
            ii3Var.getClass();
            return ii3Var;
        }
        ii3 A2 = ((p60) this.y).A(jr3Var);
        if (A2 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.x = jr3Var.k;
        obj.y = jr3Var.n;
        obj.z = A2;
        this.z = obj;
        return A2;
    }

    public void B(Set set) {
        ((String) this.z).getClass();
        try {
            SQLiteDatabase writableDatabase = ((cx5) this.y).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.z, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.gg5
    public int C(int i) {
        TextPaint textPaint = (TextPaint) this.z;
        CharSequence charSequence = (CharSequence) this.y;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    @Override // defpackage.gg5
    public int D(int i) {
        TextPaint textPaint = (TextPaint) this.z;
        CharSequence charSequence = (CharSequence) this.y;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    public InputMethodManager E() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.z;
        if (inputMethodManager == null) {
            Object systemService = ((View) this.y).getContext().getSystemService("input_method");
            systemService.getClass();
            InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
            this.z = inputMethodManager2;
            return inputMethodManager2;
        }
        return inputMethodManager;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [st3, java.lang.Object] */
    @Override // defpackage.p60
    public ii3 F(byte[] bArr) {
        byte[] bArr2;
        st3 st3Var = (st3) this.z;
        if (st3Var != null && (bArr2 = (byte[]) st3Var.x) != null && Arrays.equals(bArr2, bArr)) {
            ii3 ii3Var = (ii3) ((st3) this.z).z;
            ii3Var.getClass();
            return ii3Var;
        }
        ii3 F = ((p60) this.y).F(bArr);
        ?? obj = new Object();
        obj.x = bArr;
        obj.y = null;
        obj.z = F;
        this.z = obj;
        return F;
    }

    public void G(long j, String str, long j2) {
        ((String) this.z).getClass();
        try {
            SQLiteDatabase writableDatabase = ((cx5) this.y).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(MediationMetaData.KEY_NAME, str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.z, null, contentValues);
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    public void H(jt3 jt3Var, Handler handler) {
        mt3 mt3Var = (mt3) this.y;
        synchronized (mt3Var.d) {
            mt3Var.l = jt3Var;
            mt3Var.a.setCallback((it3) jt3Var.d, handler);
            synchronized (jt3Var.b) {
                try {
                    jt3Var.c = new WeakReference(mt3Var);
                    fu fuVar = (fu) jt3Var.e;
                    if (fuVar != null) {
                        fuVar.removeCallbacksAndMessages(null);
                    }
                    jt3Var.e = new fu(jt3Var, handler.getLooper(), (byte) 5);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void I(kr3 kr3Var) {
        mt3 mt3Var = (mt3) this.y;
        mt3Var.i = kr3Var;
        MediaSession mediaSession = mt3Var.a;
        Bundle bundle = kr3Var.x;
        MediaMetadata mediaMetadata = kr3Var.y;
        if (mediaMetadata == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            try {
                for (String str : bundle.keySet()) {
                    Integer num = (Integer) kr3.z.get(str);
                    if (num == null) {
                        num = -1;
                    }
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    Object obj = bundle.get(str);
                                    if (obj != null && !(obj instanceof CharSequence)) {
                                        if (obj instanceof Long) {
                                            builder.putLong(str, ((Long) obj).longValue());
                                        }
                                    }
                                    builder.putText(str, (CharSequence) obj);
                                } else {
                                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                                }
                            } else {
                                builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                            }
                        } else {
                            builder.putText(str, bundle.getCharSequence(str));
                        }
                    } else {
                        builder.putLong(str, bundle.getLong(str));
                    }
                }
            } catch (RuntimeException e) {
                kb0.P("MediaMetadata", "Failed to convert MediaMetadataCompat to MediaMetadata", e);
            }
            mediaMetadata = builder.build();
            kr3Var.y = mediaMetadata;
        }
        mediaSession.setMetadata(mediaMetadata);
    }

    @Override // defpackage.oe2
    public we2 J(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        a34.p();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        a34.p();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        a34.p();
        return new we2(i, iArr[0], i2, i3);
    }

    @Override // defpackage.oe2
    public EGLSurface K(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        return a34.N(eGLContext, eGLDisplay);
    }

    public void L(wn4 wn4Var) {
        RemoteCallbackList remoteCallbackList;
        mt3 mt3Var = (mt3) this.y;
        mt3Var.g = wn4Var;
        synchronized (mt3Var.d) {
            int beginBroadcast = mt3Var.f.beginBroadcast() - 1;
            while (true) {
                remoteCallbackList = mt3Var.f;
                if (beginBroadcast < 0) {
                    break;
                }
                try {
                    ((gt2) remoteCallbackList.getBroadcastItem(beginBroadcast)).f(wn4Var);
                } catch (RemoteException | SecurityException e) {
                    kb0.t("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
                beginBroadcast--;
            }
            remoteCallbackList.finishBroadcast();
        }
        MediaSession mediaSession = mt3Var.a;
        PlaybackState playbackState = wn4Var.I;
        if (playbackState == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(wn4Var.x, wn4Var.y, wn4Var.A, wn4Var.E);
            builder.setBufferedPosition(wn4Var.z);
            builder.setActions(wn4Var.B);
            builder.setErrorMessage(wn4Var.D);
            for (vn4 vn4Var : wn4Var.F) {
                vn4Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(vn4Var.x, vn4Var.y, vn4Var.z);
                builder2.setExtras(vn4Var.A);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(wn4Var.G);
            builder.setExtras(wn4Var.H);
            playbackState = builder.build();
            wn4Var.I = playbackState;
        }
        mediaSession.setPlaybackState(playbackState);
    }

    public void M(ArrayList arrayList) {
        int i = 0;
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                long j = ((pt3) obj).y;
                if (hashSet.contains(Long.valueOf(j))) {
                    kb0.t("MediaSessionCompat", h11.h(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        mt3 mt3Var = (mt3) this.y;
        MediaSession mediaSession = mt3Var.a;
        mt3Var.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            pt3 pt3Var = (pt3) obj2;
            MediaSession.QueueItem queueItem = pt3Var.z;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(pt3Var.x.a(), pt3Var.y);
                pt3Var.z = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public mu O() {
        File file = (File) this.z;
        File file2 = (File) this.y;
        if (file2.exists()) {
            if (!file.exists()) {
                if (!file2.renameTo(file)) {
                    kb0.O("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
                }
            } else {
                file2.delete();
            }
        }
        try {
            return new mu(file2);
        } catch (FileNotFoundException e) {
            File parentFile = file2.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    return new mu(file2);
                } catch (FileNotFoundException e2) {
                    throw new IOException("Couldn't create " + file2, e2);
                }
            }
            throw new IOException("Couldn't create " + file2, e);
        }
    }

    @Override // defpackage.oe2
    public void P(EGLDisplay eGLDisplay) {
        ArrayList arrayList = (ArrayList) this.z;
        for (int i = 0; i < arrayList.size(); i++) {
            a34.P((EGLContext) arrayList.get(i), eGLDisplay);
        }
        EGL14.eglReleaseThread();
        a34.o("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        a34.o("Error terminating display");
    }

    public void Q(ArrayList arrayList) {
        rc4 rc4Var;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((qc4) arrayList.get(i)).a == 1) {
                try {
                    rc4Var = new rc4((qc4) arrayList.get(i));
                } catch (pc4 unused) {
                    rc4Var = null;
                }
                this.z = rc4Var;
            }
        }
    }

    @Override // defpackage.uo1
    public Object a(l5 l5Var, j10 j10Var) {
        Object a = ((d9) this.z).a(c54.y, new b9(this, l5Var, (vz0) null), j10Var);
        if (a == w11.x) {
            return a;
        }
        return pn6.a;
    }

    @Override // defpackage.vs1
    public Object b() {
        return (jo6) this.y;
    }

    @Override // defpackage.vs1
    public boolean c(CharSequence charSequence, int i, int i2, gl6 gl6Var) {
        Spannable spannableString;
        if ((gl6Var.c & 4) > 0) {
            return true;
        }
        if (((jo6) this.y) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.y = new jo6(spannableString);
        }
        ((p18) this.z).getClass();
        ((jo6) this.y).setSpan(new hl6(gl6Var), i, i2, 33);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.f91 r5, java.lang.Throwable r6, defpackage.xz0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ms2
            if (r0 == 0) goto L13
            r0 = r7
            ms2 r0 = (defpackage.ms2) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ms2 r0 = new ms2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.x
            int r7 = r0.z
            pn6 r1 = defpackage.pn6.a
            r2 = 1
            if (r7 == 0) goto L2e
            if (r7 != r2) goto L27
            defpackage.m37.N(r4)
            return r1
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.m37.N(r4)
            l11 r4 = r5.getCoroutineContext()
            h43 r4 = defpackage.h98.w(r4)
            ar0 r4 = (defpackage.ar0) r4
            if (r6 != 0) goto L44
            r6 = r4
            j43 r6 = (defpackage.j43) r6
            r6.Q(r1)
            goto L5d
        L44:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L51
            java.util.concurrent.CancellationException r6 = (java.util.concurrent.CancellationException) r6
            r7 = r4
            t43 r7 = (defpackage.t43) r7
            r7.s(r6)
            goto L5d
        L51:
            java.lang.String r7 = "Exception occurred during request execution"
            java.util.concurrent.CancellationException r6 = defpackage.z51.b(r7, r6)
            r7 = r4
            t43 r7 = (defpackage.t43) r7
            r7.s(r6)
        L5d:
            ou r6 = defpackage.zi1.a
            yp2 r6 = r5.d0()
            mv0 r6 = r6.getAttributes()
            ou r7 = defpackage.zi1.b
            r6.getClass()
            r7.getClass()
            java.util.Map r6 = r6.c()
            boolean r6 = r6.containsKey(r7)
            if (r6 != 0) goto L80
            wc0 r5 = r5.b()     // Catch: java.lang.Throwable -> L80
            defpackage.iv.p(r5)     // Catch: java.lang.Throwable -> L80
        L80:
            r0.z = r2
            t43 r4 = (defpackage.t43) r4
            java.lang.Object r4 = r4.G(r0)
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L8d
            return r5
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt3.e(f91, java.lang.Throwable, xz0):java.lang.Object");
    }

    @Override // defpackage.jm2
    public fj4 f(fm2 fm2Var, bm2 bm2Var) {
        return new pz2((Object) ((jm2) this.y).f(fm2Var, bm2Var), this.z, (byte) 24);
    }

    public boolean g(jz0 jz0Var) {
        jz0Var.getClass();
        if (jz0Var.a((jz0) this.z)) {
            return true;
        }
        String str = (String) ((d46) this.y).getValue();
        if (str == null) {
            return false;
        }
        return b06.A(jz0Var.d, str, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        if (r13 == r8) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007f A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:49:0x007b, B:51:0x007f, B:55:0x00a9), top: B:48:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #0 {all -> 0x00a2, blocks: (B:49:0x007b, B:51:0x007f, B:55:0x00a9), top: B:48:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v0, types: [rt3] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v3, types: [rt3] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v1, types: [ic2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3, types: [v11, java.lang.Object, f91] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(defpackage.nq r13, defpackage.xz0 r14) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt3.h(nq, xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.xz0 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.os2
            if (r0 == 0) goto L13
            r0 = r10
            os2 r0 = (defpackage.os2) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            os2 r0 = new os2
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.B
            int r1 = r0.D
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            w11 r6 = defpackage.w11.x
            if (r1 == 0) goto L48
            if (r1 == r4) goto L40
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            f91 r9 = r0.A
            defpackage.m37.N(r10)     // Catch: java.util.concurrent.CancellationException -> La0
            return r9
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            return r5
        L36:
            int r1 = r0.y
            int r3 = r0.x
            yp2 r4 = r0.z
            defpackage.m37.N(r10)     // Catch: java.util.concurrent.CancellationException -> La0
            goto L84
        L40:
            int r1 = r0.y
            int r4 = r0.x
            defpackage.m37.N(r10)     // Catch: java.util.concurrent.CancellationException -> La0
            goto L6f
        L48:
            defpackage.m37.N(r10)
            or2 r10 = new or2     // Catch: java.util.concurrent.CancellationException -> La0
            r10.<init>()     // Catch: java.util.concurrent.CancellationException -> La0
            java.lang.Object r1 = r9.y     // Catch: java.util.concurrent.CancellationException -> La0
            or2 r1 = (defpackage.or2) r1     // Catch: java.util.concurrent.CancellationException -> La0
            q26 r7 = r1.e     // Catch: java.util.concurrent.CancellationException -> La0
            r10.e = r7     // Catch: java.util.concurrent.CancellationException -> La0
            r10.c(r1)     // Catch: java.util.concurrent.CancellationException -> La0
            java.lang.Object r1 = r9.z     // Catch: java.util.concurrent.CancellationException -> La0
            wp2 r1 = (defpackage.wp2) r1     // Catch: java.util.concurrent.CancellationException -> La0
            r7 = 0
            r0.x = r7     // Catch: java.util.concurrent.CancellationException -> La0
            r0.y = r7     // Catch: java.util.concurrent.CancellationException -> La0
            r0.D = r4     // Catch: java.util.concurrent.CancellationException -> La0
            java.lang.Object r10 = r1.a(r10, r0)     // Catch: java.util.concurrent.CancellationException -> La0
            if (r10 != r6) goto L6d
            goto L9e
        L6d:
            r1 = r7
            r4 = r1
        L6f:
            yp2 r10 = (defpackage.yp2) r10     // Catch: java.util.concurrent.CancellationException -> La0
            r0.z = r10     // Catch: java.util.concurrent.CancellationException -> La0
            r0.x = r4     // Catch: java.util.concurrent.CancellationException -> La0
            r0.y = r1     // Catch: java.util.concurrent.CancellationException -> La0
            r0.D = r3     // Catch: java.util.concurrent.CancellationException -> La0
            java.lang.Object r3 = defpackage.a34.n0(r10, r0)     // Catch: java.util.concurrent.CancellationException -> La0
            if (r3 != r6) goto L80
            goto L9e
        L80:
            r8 = r4
            r4 = r10
            r10 = r3
            r3 = r8
        L84:
            yp2 r10 = (defpackage.yp2) r10     // Catch: java.util.concurrent.CancellationException -> La0
            f91 r10 = r10.d()     // Catch: java.util.concurrent.CancellationException -> La0
            f91 r4 = r4.d()     // Catch: java.util.concurrent.CancellationException -> La0
            r0.z = r5     // Catch: java.util.concurrent.CancellationException -> La0
            r0.A = r10     // Catch: java.util.concurrent.CancellationException -> La0
            r0.x = r3     // Catch: java.util.concurrent.CancellationException -> La0
            r0.y = r1     // Catch: java.util.concurrent.CancellationException -> La0
            r0.D = r2     // Catch: java.util.concurrent.CancellationException -> La0
            java.lang.Object r9 = r9.e(r4, r5, r0)     // Catch: java.util.concurrent.CancellationException -> La0
            if (r9 != r6) goto L9f
        L9e:
            return r6
        L9f:
            return r10
        La0:
            r9 = move-exception
            java.lang.Throwable r9 = defpackage.h41.i0(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt3.i(xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(defpackage.xz0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ps2
            if (r0 == 0) goto L13
            r0 = r6
            ps2 r0 = (defpackage.ps2) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ps2 r0 = new ps2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.x
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.m37.N(r6)     // Catch: java.util.concurrent.CancellationException -> L60
            goto L59
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L2c:
            defpackage.m37.N(r6)
            or2 r6 = new or2     // Catch: java.util.concurrent.CancellationException -> L60
            r6.<init>()     // Catch: java.util.concurrent.CancellationException -> L60
            java.lang.Object r1 = r5.y     // Catch: java.util.concurrent.CancellationException -> L60
            or2 r1 = (defpackage.or2) r1     // Catch: java.util.concurrent.CancellationException -> L60
            q26 r3 = r1.e     // Catch: java.util.concurrent.CancellationException -> L60
            r6.e = r3     // Catch: java.util.concurrent.CancellationException -> L60
            r6.c(r1)     // Catch: java.util.concurrent.CancellationException -> L60
            ou r1 = defpackage.zi1.a     // Catch: java.util.concurrent.CancellationException -> L60
            mv0 r1 = r6.f     // Catch: java.util.concurrent.CancellationException -> L60
            ou r3 = defpackage.zi1.a     // Catch: java.util.concurrent.CancellationException -> L60
            pn6 r4 = defpackage.pn6.a     // Catch: java.util.concurrent.CancellationException -> L60
            r1.e(r3, r4)     // Catch: java.util.concurrent.CancellationException -> L60
            java.lang.Object r5 = r5.z     // Catch: java.util.concurrent.CancellationException -> L60
            wp2 r5 = (defpackage.wp2) r5     // Catch: java.util.concurrent.CancellationException -> L60
            r0.z = r2     // Catch: java.util.concurrent.CancellationException -> L60
            java.lang.Object r6 = r5.a(r6, r0)     // Catch: java.util.concurrent.CancellationException -> L60
            w11 r5 = defpackage.w11.x
            if (r6 != r5) goto L59
            return r5
        L59:
            yp2 r6 = (defpackage.yp2) r6     // Catch: java.util.concurrent.CancellationException -> L60
            f91 r5 = r6.d()     // Catch: java.util.concurrent.CancellationException -> L60
            return r5
        L60:
            r5 = move-exception
            java.lang.Throwable r5 = defpackage.h41.i0(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt3.j(xz0):java.lang.Object");
    }

    public x73 k(e73 e73Var) {
        Object obj;
        Object putIfAbsent;
        switch (this.x) {
            case 8:
                obj = ((km0) this.z).get(t80.M(e73Var));
                obj.getClass();
                v44 v44Var = (v44) obj;
                Object obj2 = v44Var.a.get();
                if (obj2 == null) {
                    synchronized (v44Var) {
                        obj2 = v44Var.a.get();
                        if (obj2 == null) {
                            obj2 = new xe0((x73) ((ub2) this.y).invoke(e73Var));
                            v44Var.a = new SoftReference(obj2);
                        }
                    }
                }
                return ((xe0) obj2).a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.z;
                Class M = t80.M(e73Var);
                Object obj3 = concurrentHashMap.get(M);
                if (obj3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(M, (obj3 = new xe0((x73) ((ub2) this.y).invoke(e73Var))))) != null) {
                    obj3 = putIfAbsent;
                }
                return ((xe0) obj3).a;
        }
    }

    @Override // defpackage.oe2
    public EGLContext l(EGLDisplay eGLDisplay, int i, int[] iArr) {
        EGLContext L = a34.L((EGLContext) this.y, eGLDisplay, i, iArr);
        ((ArrayList) this.z).add(L);
        return L;
    }

    public HashMap m() {
        try {
            ((String) this.z).getClass();
            Cursor query = ((cx5) this.y).getReadableDatabase().query((String) this.z, A, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new ye0(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, jv] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, jv] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, jv] */
    public kv n(ea2 ea2Var, ru ruVar) {
        Boolean bool;
        boolean booleanValue;
        boolean z;
        int i;
        int playbackOffloadSupport;
        int directPlaybackSupport;
        ea2Var.getClass();
        ruVar.getClass();
        int i2 = ea2Var.L;
        if (i2 == -1) {
            return kv.d;
        }
        Context context = (Context) this.y;
        Boolean bool2 = (Boolean) this.z;
        boolean z2 = false;
        if (bool2 != null) {
            booleanValue = bool2.booleanValue();
        } else {
            if (context != null) {
                String parameters = iv.y(context).getParameters("offloadVariableRateSupported");
                if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
                this.z = bool;
            } else {
                bool = Boolean.FALSE;
                this.z = bool;
            }
            booleanValue = bool.booleanValue();
        }
        String str = ea2Var.p;
        str.getClass();
        int c = qy3.c(str, ea2Var.l);
        if (c != 0 && (i = Build.VERSION.SDK_INT) >= eq6.s(c)) {
            int i3 = ea2Var.K;
            if (i3 == -1) {
                i3 = eq6.t(ea2Var.J);
            }
            if (i3 == 0) {
                return kv.d;
            }
            try {
                AudioFormat build = new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(c).build();
                if (i >= 33) {
                    directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, ruVar.b());
                    if ((directPlaybackSupport & 1) == 0) {
                        return kv.d;
                    }
                    if ((directPlaybackSupport & 3) == 3) {
                        z2 = true;
                    }
                    ?? obj = new Object();
                    obj.a = true;
                    obj.b = z2;
                    obj.c = booleanValue;
                    return obj.a();
                }
                if (i >= 31) {
                    playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, ruVar.b());
                    if (playbackOffloadSupport == 0) {
                        return kv.d;
                    }
                    ?? obj2 = new Object();
                    if (i > 32 && playbackOffloadSupport == 2) {
                        z2 = true;
                    }
                    obj2.a = true;
                    obj2.b = z2;
                    obj2.c = booleanValue;
                    return obj2.a();
                }
                if (!AudioManager.isOffloadedPlaybackSupported(build, ruVar.b())) {
                    return kv.d;
                }
                ?? obj3 = new Object();
                obj3.a = true;
                obj3.c = booleanValue;
                return obj3.a();
            } catch (IllegalArgumentException unused) {
                return kv.d;
            }
        }
        return kv.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xu3, java.lang.Object] */
    public xu3 o() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = ((mt3) this.y).a.getCurrentControllerInfo();
        ?? obj = new Object();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                obj.a = new zu3(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
                return obj;
            }
            ze0.k("packageName should be nonempty");
            return null;
        }
        qi2.m("package shouldn't be null");
        return null;
    }

    @Override // defpackage.tf0
    public void onFailure(nf0 nf0Var, IOException iOException) {
        ((File) this.y).delete();
        qg0 qg0Var = (qg0) this.z;
        if (qg0Var.s() instanceof wa4) {
            qg0Var.resumeWith(new y45(iOException));
        }
    }

    @Override // defpackage.tf0
    public void onResponse(nf0 nf0Var, p45 p45Var) {
        File file = (File) this.y;
        qg0 qg0Var = (qg0) this.z;
        try {
            try {
                if (p45Var.l()) {
                    t45 t45Var = p45Var.D;
                    if (t45Var != null) {
                        file.getClass();
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
                        try {
                            InputStream a = t45Var.a();
                            try {
                                byte[] bArr = new byte[8192];
                                while (qg0Var.s() instanceof wa4) {
                                    int read = a.read(bArr);
                                    if (read != -1) {
                                        bufferedOutputStream.write(bArr, 0, read);
                                    } else {
                                        a.close();
                                        bufferedOutputStream.close();
                                        p45Var.close();
                                        qg0Var.h(file, dg0.B);
                                        return;
                                    }
                                }
                                throw new CancellationException();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    a34.C(a, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                a34.C(bufferedOutputStream, th3);
                                throw th4;
                            }
                        }
                    }
                    throw new IOException("Subtitle response was empty");
                }
                throw new IOException("Subtitle request failed with HTTP " + p45Var.A);
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    a34.C(p45Var, th5);
                    throw th6;
                }
            }
        } catch (Exception e) {
            file.delete();
            if (qg0Var.s() instanceof wa4) {
                qg0Var.resumeWith(new y45(e));
            }
        }
    }

    public List p() {
        ArrayList arrayList;
        if (((ArrayList) this.y).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.y)) {
            arrayList = new ArrayList((ArrayList) this.y);
        }
        return arrayList;
    }

    public synchronized Map q() {
        Map map;
        map = (Map) this.z;
        if (map == null) {
            map = Collections.unmodifiableMap(new HashMap((HashMap) this.y));
            this.z = map;
        }
        return map;
    }

    @Override // defpackage.gg5
    public int r(int i) {
        TextPaint textPaint = (TextPaint) this.z;
        CharSequence charSequence = (CharSequence) this.y;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        if (textRunCursor == -1 || ((TextPaint) this.z).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 0) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [st3, java.lang.Object] */
    @Override // defpackage.p60
    public ii3 s(Uri uri) {
        Uri uri2;
        st3 st3Var = (st3) this.z;
        if (st3Var != null && (uri2 = (Uri) st3Var.y) != null && uri2.equals(uri)) {
            ii3 ii3Var = (ii3) ((st3) this.z).z;
            ii3Var.getClass();
            return ii3Var;
        }
        ii3 s = ((p60) this.y).s(uri);
        ?? obj = new Object();
        obj.x = null;
        obj.y = uri;
        obj.z = s;
        this.z = obj;
        return s;
    }

    @Override // defpackage.gg5
    public int t(int i) {
        TextPaint textPaint = (TextPaint) this.z;
        CharSequence charSequence = (CharSequence) this.y;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        if (textRunCursor == -1 || ((TextPaint) this.z).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 2) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    @Override // defpackage.r03
    public m03 toInstant() {
        throw new IllegalArgumentException(((String) this.y) + " when parsing an Instant from \"" + w65.X(64, (String) this.z) + '\"');
    }

    public String toString() {
        switch (this.x) {
            case 28:
                return "HttpStatement[" + ((or2) this.y).a + ']';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.jm2
    public fj4 u() {
        return new pz2((Object) ((jm2) this.y).u(), this.z, (byte) 24);
    }

    public void v(long j) {
        cx5 cx5Var = (cx5) this.y;
        try {
            String hexString = Long.toHexString(j);
            this.z = "ExoPlayerCacheFileMetadata" + hexString;
            if (as6.a(cx5Var.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = cx5Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    as6.b(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.z));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.z) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.oe2
    public EGLSurface w(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        int[] iArr;
        int[] iArr2 = a34.l;
        if (i != 3 && i != 10) {
            if (i != 7 && i != 6) {
                ze0.k(qx1.h(i, "Unsupported color transfer: "));
                return null;
            }
            iArr = a34.i;
            if (!z) {
                if (i == 6) {
                    if (a34.h0()) {
                        iArr2 = a34.j;
                    } else {
                        throw new ze2("BT.2020 PQ OpenGL output isn't supported.");
                    }
                } else if (a34.i0("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                    iArr2 = a34.k;
                } else {
                    throw new ze2("BT.2020 HLG OpenGL output isn't supported.");
                }
            }
        } else {
            iArr = a34.h;
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, a34.Z(eGLDisplay, iArr), obj, iArr2, 0);
        a34.o("Error creating a new EGL surface");
        return eglCreateWindowSurface;
    }

    public AutofillId x(long j) {
        return ((ContentCaptureSession) this.y).newAutofillId(((View) this.z).getAutofillId(), j);
    }

    public void y(f92 f92Var) {
        s35 s35Var = (s35) this.z;
        sn3 sn3Var = (sn3) this.y;
        int i = f92Var.b;
        if (i == 0) {
            s35Var.execute(new yc2((Object) sn3Var, (Object) f92Var.a, (byte) 1));
        } else {
            s35Var.execute(new ag0((Object) sn3Var, i, (byte) 0));
        }
    }

    public void z() {
        try {
            ((FileLock) this.z).release();
            ((FileChannel) this.y).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void N() {
    }

    public /* synthetic */ rt3(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    public rt3(String str, te4 te4Var, q18 q18Var) {
        this.x = (byte) 3;
        this.z = str;
        this.y = te4Var;
    }

    public rt3(or2 or2Var, wp2 wp2Var) {
        this.x = (byte) 28;
        wp2Var.getClass();
        this.y = or2Var;
        this.z = wp2Var;
    }

    public rt3(ub2 ub2Var, byte b) {
        this.x = b;
        switch (b) {
            case 10:
                this.y = ub2Var;
                this.z = new ConcurrentHashMap();
                return;
            default:
                this.y = ub2Var;
                this.z = new km0();
                return;
        }
    }

    public rt3(File file) {
        this.x = (byte) 4;
        this.y = file;
        this.z = new File(file.getPath() + ".bak");
    }

    public rt3(Context context, byte b) {
        this.x = b;
        switch (b) {
            case 15:
                this.y = context.getApplicationContext();
                this.z = new v71((byte) 0);
                return;
            default:
                this.y = context == null ? null : context.getApplicationContext();
                return;
        }
    }

    public rt3(byte b) {
        this.x = b;
        switch (b) {
            case 17:
                this.y = EGL14.EGL_NO_CONTEXT;
                this.z = new ArrayList();
                return;
            case 18:
                this.y = new wr6(true);
                this.z = new wr6(true);
                return;
            case 19:
                int i = zw2.z;
                this.z = new oq5(-2);
                this.y = new ew2(4);
                return;
            case 20:
            case 22:
            case 23:
            case 24:
            case 26:
            default:
                this.y = ByteBuffer.allocateDirect(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
                return;
            case 21:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.y = byteArrayOutputStream;
                this.z = new DataOutputStream(byteArrayOutputStream);
                return;
            case 25:
                this.y = new ArrayList();
                this.z = new HashMap();
                new HashMap();
                return;
            case 27:
                this.y = new HashMap();
                return;
        }
    }

    public rt3(Set set) {
        this.x = (byte) 19;
        io3.B(!set.isEmpty());
        io3.A("trackTypes must only contain TRACK_TYPE_AUDIO and/or TRACK_TYPE_VIDEO.", rr1.e.containsAll(set));
        this.z = zw2.m(set);
        this.y = new ew2(4);
    }

    public rt3(List list) {
        this.x = (byte) 19;
        int i = zw2.z;
        this.z = new oq5(-2);
        ew2 ew2Var = new ew2(4);
        ew2Var.d(list);
        this.y = ew2Var;
    }

    public rt3(jz0 jz0Var) {
        this.x = (byte) 12;
        this.z = jz0Var;
        this.y = new d46(new vt0(jz0Var, (byte) 2));
    }

    public rt3(d9 d9Var) {
        this.x = (byte) 2;
        this.z = d9Var;
        this.y = new c9(d9Var, (byte) 0);
    }

    public /* synthetic */ rt3(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }
}
