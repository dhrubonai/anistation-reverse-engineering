.class public Landroidx/media3/exoplayer/DefaultRenderersFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS:J = 0x1388L

.field public static final EXTENSION_RENDERER_MODE_OFF:I = 0x0

.field public static final EXTENSION_RENDERER_MODE_ON:I = 0x1

.field public static final EXTENSION_RENDERER_MODE_PREFER:I = 0x2

.field public static final MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY:I = 0x32

.field private static final TAG:Ljava/lang/String; = "DefaultRenderersFactory"


# instance fields
.field private allowedVideoJoiningTimeMs:J

.field private final codecAdapterFactory:Ls1/h;

.field private final context:Landroid/content/Context;

.field private enableAudioTrackPlaybackParams:Z

.field private enableDecoderFallback:Z

.field private enableFloatOutput:Z

.field private extensionRendererMode:I

.field private mediaCodecSelector:Ls1/t;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->context:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v0, Ls1/h;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ls1/h;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->codecAdapterFactory:Ls1/h;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->extensionRendererMode:I

    .line 15
    .line 16
    const-wide/16 v0, 0x1388

    .line 17
    .line 18
    iput-wide v0, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->allowedVideoJoiningTimeMs:J

    .line 19
    .line 20
    sget-object p1, Ls1/t;->o:Lk1/i;

    .line 21
    .line 22
    iput-object p1, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->mediaCodecSelector:Ls1/t;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public buildAudioRenderers(Landroid/content/Context;ILs1/t;ZLl1/x;Landroid/os/Handler;Ll1/s;Ljava/util/ArrayList;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ls1/t;",
            "Z",
            "Ll1/x;",
            "Landroid/os/Handler;",
            "Ll1/s;",
            "Ljava/util/ArrayList<",
            "Lj1/g1;",
            ">;)V"
        }
    .end annotation

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v9, p8

    .line 4
    .line 5
    const-class v10, Ll1/x;

    .line 6
    .line 7
    const-class v11, Ll1/s;

    .line 8
    .line 9
    const-class v12, Landroid/os/Handler;

    .line 10
    .line 11
    const-string v13, "DefaultRenderersFactory"

    .line 12
    .line 13
    new-instance v14, Ll1/z0;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/media3/exoplayer/DefaultRenderersFactory;->getCodecAdapterFactory()Ls1/j;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    move-object v1, v14

    .line 20
    move-object/from16 v2, p1

    .line 21
    .line 22
    move-object/from16 v4, p3

    .line 23
    .line 24
    move/from16 v5, p4

    .line 25
    .line 26
    move-object/from16 v6, p6

    .line 27
    .line 28
    move-object/from16 v7, p7

    .line 29
    .line 30
    move-object/from16 v8, p5

    .line 31
    .line 32
    invoke-direct/range {v1 .. v8}, Ll1/z0;-><init>(Landroid/content/Context;Ls1/j;Ls1/t;ZLandroid/os/Handler;Ll1/s;Ll1/x;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    invoke-virtual/range {p8 .. p8}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/4 v2, 0x2

    .line 46
    if-ne v0, v2, :cond_1

    .line 47
    .line 48
    add-int/lit8 v1, v1, -0x1

    .line 49
    .line 50
    :cond_1
    const/4 v0, 0x0

    .line 51
    const/4 v3, 0x1

    .line 52
    :try_start_0
    const-string v4, "androidx.media3.decoder.midi.MidiRenderer"

    .line 53
    .line 54
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    new-array v5, v3, [Ljava/lang/Class;

    .line 59
    .line 60
    const-class v6, Landroid/content/Context;

    .line 61
    .line 62
    aput-object v6, v5, v0

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    new-array v5, v3, [Ljava/lang/Object;

    .line 69
    .line 70
    aput-object p1, v5, v0

    .line 71
    .line 72
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Lj1/g1;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 77
    .line 78
    add-int/lit8 v5, v1, 0x1

    .line 79
    .line 80
    :try_start_1
    invoke-virtual {v9, v1, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    const-string v1, "Loaded MidiRenderer."

    .line 84
    .line 85
    invoke-static {v13, v1}, Lf1/o;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catch_0
    move v1, v5

    .line 90
    goto :goto_0

    .line 91
    :catch_1
    move-exception v0

    .line 92
    new-instance v1, Ljava/lang/RuntimeException;

    .line 93
    .line 94
    const-string v2, "Error instantiating MIDI extension"

    .line 95
    .line 96
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw v1

    .line 100
    :catch_2
    :goto_0
    move v5, v1

    .line 101
    :goto_1
    const/4 v1, 0x3

    .line 102
    :try_start_2
    const-string v4, "androidx.media3.decoder.opus.LibopusAudioRenderer"

    .line 103
    .line 104
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    new-array v6, v1, [Ljava/lang/Class;

    .line 109
    .line 110
    aput-object v12, v6, v0

    .line 111
    .line 112
    aput-object v11, v6, v3

    .line 113
    .line 114
    aput-object v10, v6, v2

    .line 115
    .line 116
    invoke-virtual {v4, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    new-array v6, v1, [Ljava/lang/Object;

    .line 121
    .line 122
    aput-object p6, v6, v0

    .line 123
    .line 124
    aput-object p7, v6, v3

    .line 125
    .line 126
    aput-object p5, v6, v2

    .line 127
    .line 128
    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    check-cast v4, Lj1/g1;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 133
    .line 134
    add-int/lit8 v6, v5, 0x1

    .line 135
    .line 136
    :try_start_3
    invoke-virtual {v9, v5, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    const-string v4, "Loaded LibopusAudioRenderer."

    .line 140
    .line 141
    invoke-static {v13, v4}, Lf1/o;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :catch_3
    move v5, v6

    .line 146
    goto :goto_2

    .line 147
    :catch_4
    move-exception v0

    .line 148
    new-instance v1, Ljava/lang/RuntimeException;

    .line 149
    .line 150
    const-string v2, "Error instantiating Opus extension"

    .line 151
    .line 152
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    throw v1

    .line 156
    :catch_5
    :goto_2
    move v6, v5

    .line 157
    :goto_3
    :try_start_4
    const-string v4, "androidx.media3.decoder.flac.LibflacAudioRenderer"

    .line 158
    .line 159
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    new-array v5, v1, [Ljava/lang/Class;

    .line 164
    .line 165
    aput-object v12, v5, v0

    .line 166
    .line 167
    aput-object v11, v5, v3

    .line 168
    .line 169
    aput-object v10, v5, v2

    .line 170
    .line 171
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    new-array v5, v1, [Ljava/lang/Object;

    .line 176
    .line 177
    aput-object p6, v5, v0

    .line 178
    .line 179
    aput-object p7, v5, v3

    .line 180
    .line 181
    aput-object p5, v5, v2

    .line 182
    .line 183
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    check-cast v4, Lj1/g1;
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7

    .line 188
    .line 189
    add-int/lit8 v5, v6, 0x1

    .line 190
    .line 191
    :try_start_5
    invoke-virtual {v9, v6, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    const-string v4, "Loaded LibflacAudioRenderer."

    .line 195
    .line 196
    invoke-static {v13, v4}, Lf1/o;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :catch_6
    move v6, v5

    .line 201
    goto :goto_4

    .line 202
    :catch_7
    move-exception v0

    .line 203
    new-instance v1, Ljava/lang/RuntimeException;

    .line 204
    .line 205
    const-string v2, "Error instantiating FLAC extension"

    .line 206
    .line 207
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 208
    .line 209
    .line 210
    throw v1

    .line 211
    :catch_8
    :goto_4
    move v5, v6

    .line 212
    :goto_5
    :try_start_6
    const-string v4, "androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer"

    .line 213
    .line 214
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    new-array v6, v1, [Ljava/lang/Class;

    .line 219
    .line 220
    aput-object v12, v6, v0

    .line 221
    .line 222
    aput-object v11, v6, v3

    .line 223
    .line 224
    aput-object v10, v6, v2

    .line 225
    .line 226
    invoke-virtual {v4, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    new-array v1, v1, [Ljava/lang/Object;

    .line 231
    .line 232
    aput-object p6, v1, v0

    .line 233
    .line 234
    aput-object p7, v1, v3

    .line 235
    .line 236
    aput-object p5, v1, v2

    .line 237
    .line 238
    invoke-virtual {v4, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    check-cast v0, Lj1/g1;

    .line 243
    .line 244
    invoke-virtual {v9, v5, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    const-string v0, "Loaded FfmpegAudioRenderer."

    .line 248
    .line 249
    invoke-static {v13, v0}, Lf1/o;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_a
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_9

    .line 250
    .line 251
    .line 252
    goto :goto_6

    .line 253
    :catch_9
    move-exception v0

    .line 254
    new-instance v1, Ljava/lang/RuntimeException;

    .line 255
    .line 256
    const-string v2, "Error instantiating FFmpeg extension"

    .line 257
    .line 258
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 259
    .line 260
    .line 261
    throw v1

    .line 262
    :catch_a
    :goto_6
    return-void
.end method

.method public buildAudioSink(Landroid/content/Context;ZZ)Ll1/x;
    .locals 1

    .line 1
    new-instance v0, Ll1/m0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ll1/m0;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, v0, Ll1/m0;->a:Z

    .line 7
    .line 8
    iput-boolean p3, v0, Ll1/m0;->b:Z

    .line 9
    .line 10
    iget-boolean p2, v0, Ll1/m0;->c:Z

    .line 11
    .line 12
    const/4 p3, 0x1

    .line 13
    xor-int/2addr p2, p3

    .line 14
    invoke-static {p2}, Lw7/b;->u(Z)V

    .line 15
    .line 16
    .line 17
    iput-boolean p3, v0, Ll1/m0;->c:Z

    .line 18
    .line 19
    iget-object p2, v0, Ll1/m0;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p2, Lf/c;

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    new-instance p2, Lf/c;

    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    new-array p3, p3, [Ld1/d;

    .line 29
    .line 30
    invoke-direct {p2, p3}, Lf/c;-><init>([Ld1/d;)V

    .line 31
    .line 32
    .line 33
    iput-object p2, v0, Ll1/m0;->f:Ljava/lang/Object;

    .line 34
    .line 35
    :cond_0
    iget-object p2, v0, Ll1/m0;->h:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p2, Ll1/e0;

    .line 38
    .line 39
    if-nez p2, :cond_1

    .line 40
    .line 41
    new-instance p2, Ll1/e0;

    .line 42
    .line 43
    invoke-direct {p2, p1}, Ll1/e0;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    iput-object p2, v0, Ll1/m0;->h:Ljava/lang/Object;

    .line 47
    .line 48
    :cond_1
    new-instance p1, Ll1/w0;

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ll1/w0;-><init>(Ll1/m0;)V

    .line 51
    .line 52
    .line 53
    return-object p1
.end method

.method public buildCameraMotionRenderers(Landroid/content/Context;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/util/ArrayList<",
            "Lj1/g1;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p1, Lc2/b;

    .line 2
    .line 3
    invoke-direct {p1}, Lc2/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public buildImageRenderers(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lj1/g1;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lr1/i;

    .line 2
    .line 3
    sget-object v1, Lr1/c;->n:Lf/p0;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lr1/i;-><init>(Lf/p0;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public buildMetadataRenderers(Landroid/content/Context;Lt1/b;Landroid/os/Looper;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lt1/b;",
            "Landroid/os/Looper;",
            "I",
            "Ljava/util/ArrayList<",
            "Lj1/g1;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p1, Lt1/c;

    .line 2
    .line 3
    invoke-direct {p1, p2, p3}, Lt1/c;-><init>(Lt1/b;Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public buildMiscellaneousRenderers(Landroid/content/Context;Landroid/os/Handler;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Handler;",
            "I",
            "Ljava/util/ArrayList<",
            "Lj1/g1;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public buildTextRenderers(Landroid/content/Context;Lx1/e;Landroid/os/Looper;ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lx1/e;",
            "Landroid/os/Looper;",
            "I",
            "Ljava/util/ArrayList<",
            "Lj1/g1;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p1, Lx1/f;

    .line 2
    .line 3
    invoke-direct {p1, p2, p3}, Lx1/f;-><init>(Lx1/e;Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public buildVideoRenderers(Landroid/content/Context;ILs1/t;ZLandroid/os/Handler;Lb2/f0;JLjava/util/ArrayList;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ls1/t;",
            "Z",
            "Landroid/os/Handler;",
            "Lb2/f0;",
            "J",
            "Ljava/util/ArrayList<",
            "Lj1/g1;",
            ">;)V"
        }
    .end annotation

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v10, p9

    .line 4
    .line 5
    const-string v11, "DefaultRenderersFactory"

    .line 6
    .line 7
    const-class v12, Lb2/f0;

    .line 8
    .line 9
    const-class v13, Landroid/os/Handler;

    .line 10
    .line 11
    new-instance v14, Lb2/l;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/media3/exoplayer/DefaultRenderersFactory;->getCodecAdapterFactory()Ls1/j;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    move-object v1, v14

    .line 18
    move-object/from16 v2, p1

    .line 19
    .line 20
    move-object/from16 v4, p3

    .line 21
    .line 22
    move-wide/from16 v5, p7

    .line 23
    .line 24
    move/from16 v7, p4

    .line 25
    .line 26
    move-object/from16 v8, p5

    .line 27
    .line 28
    move-object/from16 v9, p6

    .line 29
    .line 30
    invoke-direct/range {v1 .. v9}, Lb2/l;-><init>(Landroid/content/Context;Ls1/j;Ls1/t;JZLandroid/os/Handler;Lb2/f0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    invoke-virtual/range {p9 .. p9}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x2

    .line 44
    if-ne v0, v2, :cond_1

    .line 45
    .line 46
    add-int/lit8 v1, v1, -0x1

    .line 47
    .line 48
    :cond_1
    const/4 v0, 0x1

    .line 49
    const/16 v3, 0x32

    .line 50
    .line 51
    const/4 v4, 0x3

    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x4

    .line 54
    :try_start_0
    const-string v7, "androidx.media3.decoder.vp9.LibvpxVideoRenderer"

    .line 55
    .line 56
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    new-array v8, v6, [Ljava/lang/Class;

    .line 61
    .line 62
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 63
    .line 64
    aput-object v9, v8, v5

    .line 65
    .line 66
    aput-object v13, v8, v0

    .line 67
    .line 68
    aput-object v12, v8, v2

    .line 69
    .line 70
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    aput-object v9, v8, v4

    .line 73
    .line 74
    invoke-virtual {v7, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    new-array v8, v6, [Ljava/lang/Object;

    .line 79
    .line 80
    invoke-static/range {p7 .. p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    aput-object v9, v8, v5

    .line 85
    .line 86
    aput-object p5, v8, v0

    .line 87
    .line 88
    aput-object p6, v8, v2

    .line 89
    .line 90
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    aput-object v9, v8, v4

    .line 95
    .line 96
    invoke-virtual {v7, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    check-cast v7, Lj1/g1;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 101
    .line 102
    add-int/lit8 v8, v1, 0x1

    .line 103
    .line 104
    :try_start_1
    invoke-virtual {v10, v1, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    const-string v1, "Loaded LibvpxVideoRenderer."

    .line 108
    .line 109
    invoke-static {v11, v1}, Lf1/o;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catch_0
    move v1, v8

    .line 114
    goto :goto_0

    .line 115
    :catch_1
    move-exception v0

    .line 116
    new-instance v1, Ljava/lang/RuntimeException;

    .line 117
    .line 118
    const-string v2, "Error instantiating VP9 extension"

    .line 119
    .line 120
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    throw v1

    .line 124
    :catch_2
    :goto_0
    move v8, v1

    .line 125
    :goto_1
    :try_start_2
    const-string v1, "androidx.media3.decoder.av1.Libgav1VideoRenderer"

    .line 126
    .line 127
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    new-array v7, v6, [Ljava/lang/Class;

    .line 132
    .line 133
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 134
    .line 135
    aput-object v9, v7, v5

    .line 136
    .line 137
    aput-object v13, v7, v0

    .line 138
    .line 139
    aput-object v12, v7, v2

    .line 140
    .line 141
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 142
    .line 143
    aput-object v9, v7, v4

    .line 144
    .line 145
    invoke-virtual {v1, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    new-array v7, v6, [Ljava/lang/Object;

    .line 150
    .line 151
    invoke-static/range {p7 .. p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    aput-object v9, v7, v5

    .line 156
    .line 157
    aput-object p5, v7, v0

    .line 158
    .line 159
    aput-object p6, v7, v2

    .line 160
    .line 161
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    aput-object v9, v7, v4

    .line 166
    .line 167
    invoke-virtual {v1, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, Lj1/g1;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 172
    .line 173
    add-int/lit8 v7, v8, 0x1

    .line 174
    .line 175
    :try_start_3
    invoke-virtual {v10, v8, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    const-string v1, "Loaded Libgav1VideoRenderer."

    .line 179
    .line 180
    invoke-static {v11, v1}, Lf1/o;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :catch_3
    move v8, v7

    .line 185
    goto :goto_2

    .line 186
    :catch_4
    move-exception v0

    .line 187
    new-instance v1, Ljava/lang/RuntimeException;

    .line 188
    .line 189
    const-string v2, "Error instantiating AV1 extension"

    .line 190
    .line 191
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 192
    .line 193
    .line 194
    throw v1

    .line 195
    :catch_5
    :goto_2
    move v7, v8

    .line 196
    :goto_3
    :try_start_4
    const-string v1, "androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer"

    .line 197
    .line 198
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    new-array v8, v6, [Ljava/lang/Class;

    .line 203
    .line 204
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 205
    .line 206
    aput-object v9, v8, v5

    .line 207
    .line 208
    aput-object v13, v8, v0

    .line 209
    .line 210
    aput-object v12, v8, v2

    .line 211
    .line 212
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 213
    .line 214
    aput-object v9, v8, v4

    .line 215
    .line 216
    invoke-virtual {v1, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    new-array v6, v6, [Ljava/lang/Object;

    .line 221
    .line 222
    invoke-static/range {p7 .. p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    aput-object v8, v6, v5

    .line 227
    .line 228
    aput-object p5, v6, v0

    .line 229
    .line 230
    aput-object p6, v6, v2

    .line 231
    .line 232
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    aput-object v0, v6, v4

    .line 237
    .line 238
    invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    check-cast v0, Lj1/g1;

    .line 243
    .line 244
    invoke-virtual {v10, v7, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    const-string v0, "Loaded FfmpegVideoRenderer."

    .line 248
    .line 249
    invoke-static {v11, v0}, Lf1/o;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6

    .line 250
    .line 251
    .line 252
    goto :goto_4

    .line 253
    :catch_6
    move-exception v0

    .line 254
    new-instance v1, Ljava/lang/RuntimeException;

    .line 255
    .line 256
    const-string v2, "Error instantiating FFmpeg extension"

    .line 257
    .line 258
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 259
    .line 260
    .line 261
    throw v1

    .line 262
    :catch_7
    :goto_4
    return-void
.end method

.method public createRenderers(Landroid/os/Handler;Lb2/f0;Ll1/s;Lx1/e;Lt1/b;)[Lj1/g1;
    .locals 12

    .line 1
    move-object v10, p0

    .line 2
    new-instance v11, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->context:Landroid/content/Context;

    .line 8
    .line 9
    iget v2, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->extensionRendererMode:I

    .line 10
    .line 11
    iget-object v3, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->mediaCodecSelector:Ls1/t;

    .line 12
    .line 13
    iget-boolean v4, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->enableDecoderFallback:Z

    .line 14
    .line 15
    iget-wide v7, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->allowedVideoJoiningTimeMs:J

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-object v5, p1

    .line 19
    move-object v6, p2

    .line 20
    move-object v9, v11

    .line 21
    invoke-virtual/range {v0 .. v9}, Landroidx/media3/exoplayer/DefaultRenderersFactory;->buildVideoRenderers(Landroid/content/Context;ILs1/t;ZLandroid/os/Handler;Lb2/f0;JLjava/util/ArrayList;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->context:Landroid/content/Context;

    .line 25
    .line 26
    iget-boolean v1, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->enableFloatOutput:Z

    .line 27
    .line 28
    iget-boolean v2, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->enableAudioTrackPlaybackParams:Z

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1, v2}, Landroidx/media3/exoplayer/DefaultRenderersFactory;->buildAudioSink(Landroid/content/Context;ZZ)Ll1/x;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    iget-object v1, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->context:Landroid/content/Context;

    .line 37
    .line 38
    iget v2, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->extensionRendererMode:I

    .line 39
    .line 40
    iget-object v3, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->mediaCodecSelector:Ls1/t;

    .line 41
    .line 42
    iget-boolean v4, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->enableDecoderFallback:Z

    .line 43
    .line 44
    move-object v0, p0

    .line 45
    move-object v6, p1

    .line 46
    move-object v7, p3

    .line 47
    move-object v8, v11

    .line 48
    invoke-virtual/range {v0 .. v8}, Landroidx/media3/exoplayer/DefaultRenderersFactory;->buildAudioRenderers(Landroid/content/Context;ILs1/t;ZLl1/x;Landroid/os/Handler;Ll1/s;Ljava/util/ArrayList;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    iget-object v1, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->context:Landroid/content/Context;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget v4, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->extensionRendererMode:I

    .line 58
    .line 59
    move-object v0, p0

    .line 60
    move-object/from16 v2, p4

    .line 61
    .line 62
    move-object v5, v11

    .line 63
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/DefaultRenderersFactory;->buildTextRenderers(Landroid/content/Context;Lx1/e;Landroid/os/Looper;ILjava/util/ArrayList;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->context:Landroid/content/Context;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget v4, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->extensionRendererMode:I

    .line 73
    .line 74
    move-object/from16 v2, p5

    .line 75
    .line 76
    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/DefaultRenderersFactory;->buildMetadataRenderers(Landroid/content/Context;Lt1/b;Landroid/os/Looper;ILjava/util/ArrayList;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->context:Landroid/content/Context;

    .line 80
    .line 81
    iget v1, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->extensionRendererMode:I

    .line 82
    .line 83
    invoke-virtual {p0, v0, v1, v11}, Landroidx/media3/exoplayer/DefaultRenderersFactory;->buildCameraMotionRenderers(Landroid/content/Context;ILjava/util/ArrayList;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v11}, Landroidx/media3/exoplayer/DefaultRenderersFactory;->buildImageRenderers(Ljava/util/ArrayList;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->context:Landroid/content/Context;

    .line 90
    .line 91
    iget v1, v10, Landroidx/media3/exoplayer/DefaultRenderersFactory;->extensionRendererMode:I

    .line 92
    .line 93
    move-object v2, p1

    .line 94
    invoke-virtual {p0, v0, p1, v1, v11}, Landroidx/media3/exoplayer/DefaultRenderersFactory;->buildMiscellaneousRenderers(Landroid/content/Context;Landroid/os/Handler;ILjava/util/ArrayList;)V

    .line 95
    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    new-array v0, v0, [Lj1/g1;

    .line 99
    .line 100
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, [Lj1/g1;

    .line 105
    .line 106
    return-object v0
.end method

.method public final experimentalSetMediaCodecAsyncCryptoFlagEnabled(Z)Landroidx/media3/exoplayer/DefaultRenderersFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->codecAdapterFactory:Ls1/h;

    .line 2
    .line 3
    iput-boolean p1, v0, Ls1/h;->c:Z

    .line 4
    .line 5
    return-object p0
.end method

.method public final forceDisableMediaCodecAsynchronousQueueing()Landroidx/media3/exoplayer/DefaultRenderersFactory;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->codecAdapterFactory:Ls1/h;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iput v1, v0, Ls1/h;->b:I

    .line 5
    .line 6
    return-object p0
.end method

.method public final forceEnableMediaCodecAsynchronousQueueing()Landroidx/media3/exoplayer/DefaultRenderersFactory;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->codecAdapterFactory:Ls1/h;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput v1, v0, Ls1/h;->b:I

    .line 5
    .line 6
    return-object p0
.end method

.method public getCodecAdapterFactory()Ls1/j;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->codecAdapterFactory:Ls1/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setAllowedVideoJoiningTimeMs(J)Landroidx/media3/exoplayer/DefaultRenderersFactory;
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->allowedVideoJoiningTimeMs:J

    .line 2
    .line 3
    return-object p0
.end method

.method public final setEnableAudioFloatOutput(Z)Landroidx/media3/exoplayer/DefaultRenderersFactory;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->enableFloatOutput:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final setEnableAudioTrackPlaybackParams(Z)Landroidx/media3/exoplayer/DefaultRenderersFactory;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->enableAudioTrackPlaybackParams:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final setEnableDecoderFallback(Z)Landroidx/media3/exoplayer/DefaultRenderersFactory;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->enableDecoderFallback:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final setExtensionRendererMode(I)Landroidx/media3/exoplayer/DefaultRenderersFactory;
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->extensionRendererMode:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final setMediaCodecSelector(Ls1/t;)Landroidx/media3/exoplayer/DefaultRenderersFactory;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/DefaultRenderersFactory;->mediaCodecSelector:Ls1/t;

    .line 2
    .line 3
    return-object p0
.end method
