.class public final Lcom/google/android/recaptcha/internal/zzmh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static final zza:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    sput-object v0, Lcom/google/android/recaptcha/internal/zzmh;->zza:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    return-void
.end method

.method public static zza(II)I
    .locals 1

    rem-int/lit8 v0, p0, 0x2

    if-nez v0, :cond_0

    not-int v0, p1

    and-int/2addr v0, p0

    not-int p0, p0

    and-int/2addr p0, p1

    or-int/2addr p0, v0

    return p0

    :cond_0
    or-int v0, p0, p1

    and-int/2addr p0, p1

    sub-int/2addr v0, p0

    return v0
.end method

.method public static zzb(Ljava/lang/String;[BLcom/google/android/recaptcha/internal/zzmi;)Ljava/lang/String;
    .locals 21

    .line 1
    move-object/from16 v10, p1

    .line 2
    .line 3
    const/4 v11, 0x0

    .line 4
    move-object/from16 v0, p0

    .line 5
    .line 6
    invoke-static {v0, v11}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/16 v12, 0xc

    .line 11
    .line 12
    new-array v13, v12, [B

    .line 13
    .line 14
    array-length v1, v0

    .line 15
    add-int/lit8 v1, v1, -0xc

    .line 16
    .line 17
    new-array v14, v1, [B

    .line 18
    .line 19
    invoke-static {v0, v11, v13, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v12, v14, v11, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    const v0, 0x66513c8

    .line 26
    .line 27
    .line 28
    const v2, 0x14275b8e

    .line 29
    .line 30
    .line 31
    const v3, 0x1e77469f

    .line 32
    .line 33
    .line 34
    const v4, 0x4c275a94    # 4.38708E7f

    .line 35
    .line 36
    .line 37
    filled-new-array {v3, v4, v0, v2}, [I

    .line 38
    .line 39
    .line 40
    move-result-object v15

    .line 41
    array-length v0, v10

    .line 42
    const/16 v2, 0x20

    .line 43
    .line 44
    if-ne v0, v2, :cond_7

    .line 45
    .line 46
    const/16 v9, 0x10

    .line 47
    .line 48
    new-array v8, v9, [I

    .line 49
    .line 50
    move v0, v11

    .line 51
    :goto_0
    const/4 v2, 0x4

    .line 52
    if-ge v0, v2, :cond_0

    .line 53
    .line 54
    aget v2, v15, v0

    .line 55
    .line 56
    const v3, 0x7f073efa

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v3}, Lcom/google/android/recaptcha/internal/zzmh;->zza(II)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    aput v2, v8, v0

    .line 64
    .line 65
    add-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move v0, v2

    .line 69
    :goto_1
    if-ge v0, v12, :cond_1

    .line 70
    .line 71
    add-int/lit8 v3, v0, -0x4

    .line 72
    .line 73
    mul-int/2addr v3, v2

    .line 74
    invoke-static {v10, v3}, Lcom/google/android/recaptcha/internal/zzmh;->zze([BI)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    aput v3, v8, v0

    .line 79
    .line 80
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    const/4 v0, 0x1

    .line 84
    aput v0, v8, v12

    .line 85
    .line 86
    const/16 v3, 0xd

    .line 87
    .line 88
    :goto_2
    if-ge v3, v9, :cond_2

    .line 89
    .line 90
    add-int/lit8 v4, v3, -0xd

    .line 91
    .line 92
    mul-int/2addr v4, v2

    .line 93
    invoke-static {v13, v4}, Lcom/google/android/recaptcha/internal/zzmh;->zze([BI)I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    aput v4, v8, v3

    .line 98
    .line 99
    add-int/lit8 v3, v3, 0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    new-array v7, v9, [I

    .line 103
    .line 104
    invoke-static {v8, v11, v7, v11, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 105
    .line 106
    .line 107
    new-array v6, v1, [B

    .line 108
    .line 109
    move/from16 v16, v0

    .line 110
    .line 111
    move v5, v1

    .line 112
    move/from16 v17, v11

    .line 113
    .line 114
    :goto_3
    if-lez v5, :cond_6

    .line 115
    .line 116
    invoke-static {v7, v11, v8, v11, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 117
    .line 118
    .line 119
    aput v16, v8, v12

    .line 120
    .line 121
    move v4, v11

    .line 122
    :goto_4
    const/16 v0, 0xa

    .line 123
    .line 124
    if-ge v4, v0, :cond_3

    .line 125
    .line 126
    const/4 v0, 0x0

    .line 127
    const/4 v1, 0x4

    .line 128
    const/16 v2, 0x8

    .line 129
    .line 130
    const/16 v3, 0xc

    .line 131
    .line 132
    move/from16 v18, v4

    .line 133
    .line 134
    move-object v4, v15

    .line 135
    move v11, v5

    .line 136
    move-object/from16 v5, p1

    .line 137
    .line 138
    move-object v12, v6

    .line 139
    move-object v6, v13

    .line 140
    move-object/from16 v19, v7

    .line 141
    .line 142
    move/from16 v7, v16

    .line 143
    .line 144
    move-object/from16 v20, v8

    .line 145
    .line 146
    move v10, v9

    .line 147
    move-object/from16 v9, v19

    .line 148
    .line 149
    invoke-static/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzmh;->zzc(IIII[I[B[BI[I[I)V

    .line 150
    .line 151
    .line 152
    const/4 v0, 0x1

    .line 153
    const/4 v1, 0x5

    .line 154
    const/16 v2, 0x9

    .line 155
    .line 156
    const/16 v3, 0xd

    .line 157
    .line 158
    invoke-static/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzmh;->zzc(IIII[I[B[BI[I[I)V

    .line 159
    .line 160
    .line 161
    const/4 v0, 0x2

    .line 162
    const/4 v1, 0x6

    .line 163
    const/16 v2, 0xa

    .line 164
    .line 165
    const/16 v3, 0xe

    .line 166
    .line 167
    invoke-static/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzmh;->zzc(IIII[I[B[BI[I[I)V

    .line 168
    .line 169
    .line 170
    const/4 v0, 0x3

    .line 171
    const/4 v1, 0x7

    .line 172
    const/16 v2, 0xb

    .line 173
    .line 174
    const/16 v3, 0xf

    .line 175
    .line 176
    invoke-static/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzmh;->zzc(IIII[I[B[BI[I[I)V

    .line 177
    .line 178
    .line 179
    const/4 v0, 0x0

    .line 180
    const/4 v1, 0x5

    .line 181
    const/16 v2, 0xa

    .line 182
    .line 183
    invoke-static/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzmh;->zzc(IIII[I[B[BI[I[I)V

    .line 184
    .line 185
    .line 186
    const/4 v0, 0x1

    .line 187
    const/4 v1, 0x6

    .line 188
    const/16 v2, 0xb

    .line 189
    .line 190
    const/16 v3, 0xc

    .line 191
    .line 192
    invoke-static/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzmh;->zzc(IIII[I[B[BI[I[I)V

    .line 193
    .line 194
    .line 195
    const/4 v0, 0x2

    .line 196
    const/4 v1, 0x7

    .line 197
    const/16 v2, 0x8

    .line 198
    .line 199
    const/16 v3, 0xd

    .line 200
    .line 201
    invoke-static/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzmh;->zzc(IIII[I[B[BI[I[I)V

    .line 202
    .line 203
    .line 204
    const/4 v0, 0x3

    .line 205
    const/4 v1, 0x4

    .line 206
    const/16 v2, 0x9

    .line 207
    .line 208
    const/16 v3, 0xe

    .line 209
    .line 210
    invoke-static/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzmh;->zzc(IIII[I[B[BI[I[I)V

    .line 211
    .line 212
    .line 213
    add-int/lit8 v4, v18, 0x1

    .line 214
    .line 215
    move v9, v10

    .line 216
    move v5, v11

    .line 217
    move-object v6, v12

    .line 218
    move-object/from16 v7, v19

    .line 219
    .line 220
    const/4 v11, 0x0

    .line 221
    const/16 v12, 0xc

    .line 222
    .line 223
    move-object/from16 v10, p1

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_3
    move v11, v5

    .line 227
    move-object v12, v6

    .line 228
    move-object/from16 v19, v7

    .line 229
    .line 230
    move-object/from16 v20, v8

    .line 231
    .line 232
    move v10, v9

    .line 233
    const/16 v0, 0x40

    .line 234
    .line 235
    new-array v1, v0, [B

    .line 236
    .line 237
    const/4 v2, 0x0

    .line 238
    :goto_5
    if-ge v2, v10, :cond_4

    .line 239
    .line 240
    aget v3, v20, v2

    .line 241
    .line 242
    mul-int/lit8 v4, v2, 0x4

    .line 243
    .line 244
    and-int/lit16 v5, v3, 0xff

    .line 245
    .line 246
    int-to-byte v5, v5

    .line 247
    aput-byte v5, v1, v4

    .line 248
    .line 249
    shr-int/lit8 v5, v3, 0x8

    .line 250
    .line 251
    add-int/lit8 v6, v4, 0x1

    .line 252
    .line 253
    and-int/lit16 v5, v5, 0xff

    .line 254
    .line 255
    int-to-byte v5, v5

    .line 256
    aput-byte v5, v1, v6

    .line 257
    .line 258
    shr-int/lit8 v5, v3, 0x10

    .line 259
    .line 260
    add-int/lit8 v6, v4, 0x2

    .line 261
    .line 262
    and-int/lit16 v5, v5, 0xff

    .line 263
    .line 264
    int-to-byte v5, v5

    .line 265
    aput-byte v5, v1, v6

    .line 266
    .line 267
    shr-int/lit8 v3, v3, 0x18

    .line 268
    .line 269
    add-int/lit8 v4, v4, 0x3

    .line 270
    .line 271
    and-int/lit16 v3, v3, 0xff

    .line 272
    .line 273
    int-to-byte v3, v3

    .line 274
    aput-byte v3, v1, v4

    .line 275
    .line 276
    add-int/lit8 v2, v2, 0x1

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_4
    const/4 v2, 0x0

    .line 280
    :goto_6
    invoke-static {v0, v11}, Ljava/lang/Math;->min(II)I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-ge v2, v3, :cond_5

    .line 285
    .line 286
    add-int v3, v17, v2

    .line 287
    .line 288
    aget-byte v4, v1, v2

    .line 289
    .line 290
    aget-byte v5, v14, v3

    .line 291
    .line 292
    invoke-static {v4, v5}, Lcom/google/android/recaptcha/internal/zzmh;->zza(II)I

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    int-to-byte v4, v4

    .line 297
    aput-byte v4, v12, v3

    .line 298
    .line 299
    add-int/lit8 v2, v2, 0x1

    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_5
    add-int/lit8 v16, v16, 0x1

    .line 303
    .line 304
    add-int/lit8 v5, v11, -0x40

    .line 305
    .line 306
    add-int/lit8 v17, v17, 0x40

    .line 307
    .line 308
    move v9, v10

    .line 309
    move-object v6, v12

    .line 310
    move-object/from16 v7, v19

    .line 311
    .line 312
    move-object/from16 v8, v20

    .line 313
    .line 314
    const/4 v11, 0x0

    .line 315
    const/16 v12, 0xc

    .line 316
    .line 317
    move-object/from16 v10, p1

    .line 318
    .line 319
    goto/16 :goto_3

    .line 320
    .line 321
    :cond_6
    move-object v12, v6

    .line 322
    new-instance v0, Ljava/lang/String;

    .line 323
    .line 324
    sget-object v1, Lcom/google/android/recaptcha/internal/zzmh;->zza:Ljava/nio/charset/Charset;

    .line 325
    .line 326
    invoke-direct {v0, v12, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 327
    .line 328
    .line 329
    return-object v0

    .line 330
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 331
    .line 332
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 333
    .line 334
    .line 335
    throw v0
.end method

.method public static final zzc(IIII[I[B[BI[I[I)V
    .locals 18

    .line 1
    const/16 v3, 0x10

    .line 2
    .line 3
    move/from16 v0, p0

    .line 4
    .line 5
    move/from16 v1, p1

    .line 6
    .line 7
    move/from16 v2, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move-object/from16 v6, p6

    .line 14
    .line 15
    move/from16 v7, p7

    .line 16
    .line 17
    move-object/from16 v8, p8

    .line 18
    .line 19
    move-object/from16 v9, p9

    .line 20
    .line 21
    invoke-static/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzmh;->zzd(IIII[I[B[BI[I[I)V

    .line 22
    .line 23
    .line 24
    const/16 v7, 0xc

    .line 25
    .line 26
    move/from16 v4, p2

    .line 27
    .line 28
    move/from16 v5, p3

    .line 29
    .line 30
    move/from16 v6, p1

    .line 31
    .line 32
    move-object/from16 v8, p4

    .line 33
    .line 34
    move-object/from16 v9, p5

    .line 35
    .line 36
    move-object/from16 v10, p6

    .line 37
    .line 38
    move/from16 v11, p7

    .line 39
    .line 40
    move-object/from16 v12, p8

    .line 41
    .line 42
    move-object/from16 v13, p9

    .line 43
    .line 44
    invoke-static/range {v4 .. v13}, Lcom/google/android/recaptcha/internal/zzmh;->zzd(IIII[I[B[BI[I[I)V

    .line 45
    .line 46
    .line 47
    const/16 v11, 0x8

    .line 48
    .line 49
    move/from16 v8, p0

    .line 50
    .line 51
    move/from16 v9, p1

    .line 52
    .line 53
    move/from16 v10, p3

    .line 54
    .line 55
    move-object/from16 v12, p4

    .line 56
    .line 57
    move-object/from16 v13, p5

    .line 58
    .line 59
    move-object/from16 v14, p6

    .line 60
    .line 61
    move/from16 v15, p7

    .line 62
    .line 63
    move-object/from16 v16, p8

    .line 64
    .line 65
    move-object/from16 v17, p9

    .line 66
    .line 67
    invoke-static/range {v8 .. v17}, Lcom/google/android/recaptcha/internal/zzmh;->zzd(IIII[I[B[BI[I[I)V

    .line 68
    .line 69
    .line 70
    const/4 v3, 0x7

    .line 71
    move/from16 v0, p2

    .line 72
    .line 73
    move/from16 v1, p3

    .line 74
    .line 75
    move/from16 v2, p1

    .line 76
    .line 77
    move-object/from16 v4, p4

    .line 78
    .line 79
    move-object/from16 v5, p5

    .line 80
    .line 81
    move-object/from16 v6, p6

    .line 82
    .line 83
    move/from16 v7, p7

    .line 84
    .line 85
    move-object/from16 v8, p8

    .line 86
    .line 87
    move-object/from16 v9, p9

    .line 88
    .line 89
    invoke-static/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzmh;->zzd(IIII[I[B[BI[I[I)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public static final zzd(IIII[I[B[BI[I[I)V
    .locals 0

    aget p4, p8, p0

    aget p1, p8, p1

    add-int/2addr p4, p1

    aput p4, p8, p0

    aget p0, p8, p2

    invoke-static {p0, p4}, Lcom/google/android/recaptcha/internal/zzmh;->zza(II)I

    move-result p0

    rsub-int/lit8 p1, p3, 0x20

    ushr-int p1, p0, p1

    shl-int/2addr p0, p3

    or-int/2addr p0, p1

    aput p0, p8, p2

    return-void
.end method

.method private static final zze([BI)I
    .locals 3

    .line 1
    aget-byte v0, p0, p1

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    aget-byte v1, p0, v1

    .line 8
    .line 9
    and-int/lit16 v1, v1, 0xff

    .line 10
    .line 11
    add-int/lit8 v2, p1, 0x2

    .line 12
    .line 13
    aget-byte v2, p0, v2

    .line 14
    .line 15
    and-int/lit16 v2, v2, 0xff

    .line 16
    .line 17
    add-int/lit8 p1, p1, 0x3

    .line 18
    .line 19
    aget-byte p0, p0, p1

    .line 20
    .line 21
    and-int/lit16 p0, p0, 0xff

    .line 22
    .line 23
    shl-int/lit8 p1, v1, 0x8

    .line 24
    .line 25
    or-int/2addr p1, v0

    .line 26
    shl-int/lit8 v0, v2, 0x10

    .line 27
    .line 28
    or-int/2addr p1, v0

    .line 29
    shl-int/lit8 p0, p0, 0x18

    .line 30
    .line 31
    or-int/2addr p0, p1

    .line 32
    return p0
.end method
