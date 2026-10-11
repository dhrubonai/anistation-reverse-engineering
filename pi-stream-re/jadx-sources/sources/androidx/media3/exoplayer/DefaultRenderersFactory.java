package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b2.f0;
import b2.l;
import d1.d;
import f.c;
import f1.o;
import j1.g1;
import java.util.ArrayList;
import l1.e0;
import l1.m0;
import l1.s;
import l1.w0;
import l1.x;
import l1.z0;
import r1.i;
import s1.h;
import s1.j;
import s1.t;
import w7.b;
import x1.e;
import x1.f;

/* loaded from: classes.dex */
public class DefaultRenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final String TAG = "DefaultRenderersFactory";
    private final h codecAdapterFactory;
    private final Context context;
    private boolean enableAudioTrackPlaybackParams;
    private boolean enableDecoderFallback;
    private boolean enableFloatOutput;
    private int extensionRendererMode = 0;
    private long allowedVideoJoiningTimeMs = 5000;
    private t mediaCodecSelector = t.o;

    public DefaultRenderersFactory(Context context) {
        this.context = context;
        this.codecAdapterFactory = new h(context);
    }

    public void buildAudioRenderers(Context context, int i10, t tVar, boolean z9, x xVar, Handler handler, s sVar, ArrayList<g1> arrayList) {
        int i11;
        int i12;
        int i13;
        arrayList.add(new z0(context, getCodecAdapterFactory(), tVar, z9, handler, sVar, xVar));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (g1) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class).newInstance(context));
                    o.e(TAG, "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                    try {
                        i12 = i11 + 1;
                        try {
                            arrayList.add(i11, (g1) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, s.class, x.class).newInstance(handler, sVar, xVar));
                            o.e(TAG, "Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused2) {
                            i11 = i12;
                            i12 = i11;
                            try {
                                i13 = i12 + 1;
                                try {
                                    arrayList.add(i12, (g1) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, s.class, x.class).newInstance(handler, sVar, xVar));
                                    o.e(TAG, "Loaded LibflacAudioRenderer.");
                                } catch (ClassNotFoundException unused3) {
                                    i12 = i13;
                                    i13 = i12;
                                    arrayList.add(i13, (g1) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, s.class, x.class).newInstance(handler, sVar, xVar));
                                    o.e(TAG, "Loaded FfmpegAudioRenderer.");
                                }
                            } catch (ClassNotFoundException unused4) {
                            }
                            arrayList.add(i13, (g1) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, s.class, x.class).newInstance(handler, sVar, xVar));
                            o.e(TAG, "Loaded FfmpegAudioRenderer.");
                        }
                    } catch (ClassNotFoundException unused5) {
                    }
                    try {
                        i13 = i12 + 1;
                        arrayList.add(i12, (g1) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, s.class, x.class).newInstance(handler, sVar, xVar));
                        o.e(TAG, "Loaded LibflacAudioRenderer.");
                        arrayList.add(i13, (g1) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, s.class, x.class).newInstance(handler, sVar, xVar));
                        o.e(TAG, "Loaded FfmpegAudioRenderer.");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating FLAC extension", e10);
                    }
                }
            } catch (ClassNotFoundException unused6) {
            }
            try {
                i12 = i11 + 1;
                arrayList.add(i11, (g1) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, s.class, x.class).newInstance(handler, sVar, xVar));
                o.e(TAG, "Loaded LibopusAudioRenderer.");
                i13 = i12 + 1;
                arrayList.add(i12, (g1) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, s.class, x.class).newInstance(handler, sVar, xVar));
                o.e(TAG, "Loaded LibflacAudioRenderer.");
                try {
                    arrayList.add(i13, (g1) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, s.class, x.class).newInstance(handler, sVar, xVar));
                    o.e(TAG, "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused7) {
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e11);
                }
            } catch (Exception e12) {
                throw new RuntimeException("Error instantiating Opus extension", e12);
            }
        } catch (Exception e13) {
            throw new RuntimeException("Error instantiating MIDI extension", e13);
        }
    }

    public x buildAudioSink(Context context, boolean z9, boolean z10) {
        m0 m0Var = new m0(context);
        m0Var.f6689a = z9;
        m0Var.f6690b = z10;
        b.u(!m0Var.f6691c);
        m0Var.f6691c = true;
        if (((c) m0Var.f6694f) == null) {
            m0Var.f6694f = new c(new d[0]);
        }
        if (((e0) m0Var.f6696h) == null) {
            m0Var.f6696h = new e0(context);
        }
        return new w0(m0Var);
    }

    public void buildCameraMotionRenderers(Context context, int i10, ArrayList<g1> arrayList) {
        arrayList.add(new c2.b());
    }

    public void buildImageRenderers(ArrayList<g1> arrayList) {
        arrayList.add(new i(r1.c.f9305n));
    }

    public void buildMetadataRenderers(Context context, t1.b bVar, Looper looper, int i10, ArrayList<g1> arrayList) {
        arrayList.add(new t1.c(bVar, looper));
    }

    public void buildMiscellaneousRenderers(Context context, Handler handler, int i10, ArrayList<g1> arrayList) {
    }

    public void buildTextRenderers(Context context, e eVar, Looper looper, int i10, ArrayList<g1> arrayList) {
        arrayList.add(new f(eVar, looper));
    }

    public void buildVideoRenderers(Context context, int i10, t tVar, boolean z9, Handler handler, f0 f0Var, long j4, ArrayList<g1> arrayList) {
        int i11;
        int i12;
        arrayList.add(new l(context, getCodecAdapterFactory(), tVar, j4, z9, handler, f0Var));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (g1) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, f0.class, Integer.TYPE).newInstance(Long.valueOf(j4), handler, f0Var, 50));
                    o.e(TAG, "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                    try {
                        i12 = i11 + 1;
                        try {
                            arrayList.add(i11, (g1) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, f0.class, Integer.TYPE).newInstance(Long.valueOf(j4), handler, f0Var, 50));
                            o.e(TAG, "Loaded Libgav1VideoRenderer.");
                        } catch (ClassNotFoundException unused2) {
                            i11 = i12;
                            i12 = i11;
                            arrayList.add(i12, (g1) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, f0.class, Integer.TYPE).newInstance(Long.valueOf(j4), handler, f0Var, 50));
                            o.e(TAG, "Loaded FfmpegVideoRenderer.");
                        }
                    } catch (ClassNotFoundException unused3) {
                    }
                    arrayList.add(i12, (g1) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, f0.class, Integer.TYPE).newInstance(Long.valueOf(j4), handler, f0Var, 50));
                    o.e(TAG, "Loaded FfmpegVideoRenderer.");
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                i12 = i11 + 1;
                arrayList.add(i11, (g1) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, f0.class, Integer.TYPE).newInstance(Long.valueOf(j4), handler, f0Var, 50));
                o.e(TAG, "Loaded Libgav1VideoRenderer.");
                try {
                    arrayList.add(i12, (g1) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, f0.class, Integer.TYPE).newInstance(Long.valueOf(j4), handler, f0Var, 50));
                    o.e(TAG, "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e10);
                }
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating AV1 extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating VP9 extension", e12);
        }
    }

    public g1[] createRenderers(Handler handler, f0 f0Var, s sVar, e eVar, t1.b bVar) {
        ArrayList<g1> arrayList = new ArrayList<>();
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, f0Var, this.allowedVideoJoiningTimeMs, arrayList);
        x buildAudioSink = buildAudioSink(this.context, this.enableFloatOutput, this.enableAudioTrackPlaybackParams);
        if (buildAudioSink != null) {
            buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, buildAudioSink, handler, sVar, arrayList);
        }
        buildTextRenderers(this.context, eVar, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, bVar, handler.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildImageRenderers(arrayList);
        buildMiscellaneousRenderers(this.context, handler, this.extensionRendererMode, arrayList);
        return (g1[]) arrayList.toArray(new g1[0]);
    }

    public final DefaultRenderersFactory experimentalSetMediaCodecAsyncCryptoFlagEnabled(boolean z9) {
        this.codecAdapterFactory.f9794c = z9;
        return this;
    }

    public final DefaultRenderersFactory forceDisableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.f9793b = 2;
        return this;
    }

    public final DefaultRenderersFactory forceEnableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.f9793b = 1;
        return this;
    }

    public j getCodecAdapterFactory() {
        return this.codecAdapterFactory;
    }

    public final DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long j4) {
        this.allowedVideoJoiningTimeMs = j4;
        return this;
    }

    public final DefaultRenderersFactory setEnableAudioFloatOutput(boolean z9) {
        this.enableFloatOutput = z9;
        return this;
    }

    public final DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean z9) {
        this.enableAudioTrackPlaybackParams = z9;
        return this;
    }

    public final DefaultRenderersFactory setEnableDecoderFallback(boolean z9) {
        this.enableDecoderFallback = z9;
        return this;
    }

    public final DefaultRenderersFactory setExtensionRendererMode(int i10) {
        this.extensionRendererMode = i10;
        return this;
    }

    public final DefaultRenderersFactory setMediaCodecSelector(t tVar) {
        this.mediaCodecSelector = tVar;
        return this;
    }
}
