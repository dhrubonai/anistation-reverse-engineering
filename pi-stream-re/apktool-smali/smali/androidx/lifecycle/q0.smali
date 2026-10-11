.class public Landroidx/lifecycle/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly0/b;
.implements Lb4/y;
.implements Lcom/google/android/gms/common/internal/r;
.implements Le0/i;
.implements Lf9/e0;
.implements Lh4/a;
.implements Ln4/e;
.implements Lo1/q;
.implements Lz6/h;
.implements Lt1/a;
.implements Lv3/j;
.implements Lx2/h;
.implements Ly1/r;
.implements Ly3/d;
.implements Ly8/b;
.implements Ly8/l;
.implements Ly8/m;


# static fields
.field public static final synthetic A:Landroidx/lifecycle/q0;

.field public static final a:Landroidx/lifecycle/q0;

.field public static final b:Landroidx/lifecycle/q0;

.field public static final c:Landroidx/lifecycle/q0;

.field public static final d:Landroidx/lifecycle/q0;

.field public static final e:Landroidx/lifecycle/q0;

.field public static final synthetic f:Landroidx/lifecycle/q0;

.field public static final synthetic x:Landroidx/lifecycle/q0;

.field public static final y:Landroidx/lifecycle/q0;

.field public static final z:Landroidx/lifecycle/q0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/q0;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/lifecycle/q0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/q0;->a:Landroidx/lifecycle/q0;

    .line 7
    .line 8
    new-instance v0, Landroidx/lifecycle/q0;

    .line 9
    .line 10
    invoke-direct {v0}, Landroidx/lifecycle/q0;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/lifecycle/q0;->b:Landroidx/lifecycle/q0;

    .line 14
    .line 15
    new-instance v0, Landroidx/lifecycle/q0;

    .line 16
    .line 17
    invoke-direct {v0}, Landroidx/lifecycle/q0;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/lifecycle/q0;->c:Landroidx/lifecycle/q0;

    .line 21
    .line 22
    new-instance v0, Landroidx/lifecycle/q0;

    .line 23
    .line 24
    invoke-direct {v0}, Landroidx/lifecycle/q0;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Landroidx/lifecycle/q0;->d:Landroidx/lifecycle/q0;

    .line 28
    .line 29
    new-instance v0, Landroidx/lifecycle/q0;

    .line 30
    .line 31
    invoke-direct {v0}, Landroidx/lifecycle/q0;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Landroidx/lifecycle/q0;->e:Landroidx/lifecycle/q0;

    .line 35
    .line 36
    new-instance v0, Landroidx/lifecycle/q0;

    .line 37
    .line 38
    invoke-direct {v0}, Landroidx/lifecycle/q0;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Landroidx/lifecycle/q0;->f:Landroidx/lifecycle/q0;

    .line 42
    .line 43
    new-instance v0, Landroidx/lifecycle/q0;

    .line 44
    .line 45
    invoke-direct {v0}, Landroidx/lifecycle/q0;-><init>()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Landroidx/lifecycle/q0;->x:Landroidx/lifecycle/q0;

    .line 49
    .line 50
    new-instance v0, Landroidx/lifecycle/q0;

    .line 51
    .line 52
    invoke-direct {v0}, Landroidx/lifecycle/q0;-><init>()V

    .line 53
    .line 54
    .line 55
    sput-object v0, Landroidx/lifecycle/q0;->y:Landroidx/lifecycle/q0;

    .line 56
    .line 57
    new-instance v0, Landroidx/lifecycle/q0;

    .line 58
    .line 59
    invoke-direct {v0}, Landroidx/lifecycle/q0;-><init>()V

    .line 60
    .line 61
    .line 62
    sput-object v0, Landroidx/lifecycle/q0;->z:Landroidx/lifecycle/q0;

    .line 63
    .line 64
    new-instance v0, Landroidx/lifecycle/q0;

    .line 65
    .line 66
    invoke-direct {v0}, Landroidx/lifecycle/q0;-><init>()V

    .line 67
    .line 68
    .line 69
    sput-object v0, Landroidx/lifecycle/q0;->A:Landroidx/lifecycle/q0;

    .line 70
    .line 71
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;ILjava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Lf1/r;)J
    .locals 4

    .line 1
    iget-object v0, p0, Lf1/r;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/IOException;

    .line 4
    .line 5
    instance-of v1, v0, Lc1/r0;

    .line 6
    .line 7
    if-nez v1, :cond_3

    .line 8
    .line 9
    instance-of v1, v0, Ljava/io/FileNotFoundException;

    .line 10
    .line 11
    if-nez v1, :cond_3

    .line 12
    .line 13
    instance-of v1, v0, Lh1/v;

    .line 14
    .line 15
    if-nez v1, :cond_3

    .line 16
    .line 17
    instance-of v1, v0, Lz1/n;

    .line 18
    .line 19
    if-nez v1, :cond_3

    .line 20
    .line 21
    sget v1, Lh1/i;->b:I

    .line 22
    .line 23
    :goto_0
    const/4 v1, 0x1

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    instance-of v2, v0, Lh1/i;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    move-object v2, v0

    .line 31
    check-cast v2, Lh1/i;

    .line 32
    .line 33
    iget v2, v2, Lh1/i;->a:I

    .line 34
    .line 35
    const/16 v3, 0x7d8

    .line 36
    .line 37
    if-ne v2, v3, :cond_0

    .line 38
    .line 39
    move v0, v1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v0, 0x0

    .line 47
    :goto_1
    if-eqz v0, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    iget p0, p0, Lf1/r;->a:I

    .line 51
    .line 52
    sub-int/2addr p0, v1

    .line 53
    mul-int/lit16 p0, p0, 0x3e8

    .line 54
    .line 55
    const/16 v0, 0x1388

    .line 56
    .line 57
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    int-to-long v0, p0

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    :goto_2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    :goto_3
    return-wide v0
.end method

.method public static C(Ly8/o;)Ly8/c;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "headers"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Ly8/o;->a:[Ljava/lang/String;

    .line 9
    .line 10
    array-length v1, v1

    .line 11
    const/4 v2, 0x2

    .line 12
    div-int/2addr v1, v2

    .line 13
    const/4 v4, 0x0

    .line 14
    move v7, v4

    .line 15
    move v11, v7

    .line 16
    move v12, v11

    .line 17
    move v15, v12

    .line 18
    move/from16 v16, v15

    .line 19
    .line 20
    move/from16 v17, v16

    .line 21
    .line 22
    move/from16 v20, v17

    .line 23
    .line 24
    move/from16 v21, v20

    .line 25
    .line 26
    move/from16 v22, v21

    .line 27
    .line 28
    const/4 v8, 0x1

    .line 29
    const/4 v9, 0x0

    .line 30
    const/4 v13, -0x1

    .line 31
    const/4 v14, -0x1

    .line 32
    const/16 v18, -0x1

    .line 33
    .line 34
    const/16 v19, -0x1

    .line 35
    .line 36
    :goto_0
    if-ge v7, v1, :cond_1b

    .line 37
    .line 38
    invoke-virtual {v0, v7}, Ly8/o;->c(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    invoke-virtual {v0, v7}, Ly8/o;->e(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    const-string v6, "Cache-Control"

    .line 47
    .line 48
    invoke-static {v10, v6}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    if-eqz v9, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    move-object v9, v5

    .line 58
    goto :goto_2

    .line 59
    :cond_1
    const-string v6, "Pragma"

    .line 60
    .line 61
    invoke-static {v10, v6}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_1a

    .line 66
    .line 67
    :goto_1
    move v8, v4

    .line 68
    :goto_2
    move v6, v4

    .line 69
    :goto_3
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    if-ge v6, v10, :cond_19

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    move v3, v6

    .line 80
    :goto_4
    if-ge v3, v10, :cond_4

    .line 81
    .line 82
    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    move/from16 v24, v1

    .line 87
    .line 88
    const-string v1, "=,;"

    .line 89
    .line 90
    invoke-static {v1, v0, v4, v4, v2}, Lo7/j;->p1(Ljava/lang/CharSequence;CIZI)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-ltz v0, :cond_2

    .line 95
    .line 96
    const/4 v0, 0x1

    .line 97
    goto :goto_5

    .line 98
    :cond_2
    move v0, v4

    .line 99
    :goto_5
    if-eqz v0, :cond_3

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    move-object/from16 v0, p0

    .line 105
    .line 106
    move/from16 v1, v24

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    move/from16 v24, v1

    .line 110
    .line 111
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    :goto_6
    invoke-virtual {v5, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const-string v1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 120
    .line 121
    invoke-static {v0, v1}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, Lo7/j;->G1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-eq v3, v6, :cond_c

    .line 137
    .line 138
    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    const/16 v10, 0x2c

    .line 143
    .line 144
    if-eq v6, v10, :cond_c

    .line 145
    .line 146
    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    const/16 v10, 0x3b

    .line 151
    .line 152
    if-ne v6, v10, :cond_5

    .line 153
    .line 154
    goto/16 :goto_c

    .line 155
    .line 156
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 157
    .line 158
    sget-object v6, Lz8/b;->a:[B

    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    :goto_7
    if-ge v3, v6, :cond_7

    .line 165
    .line 166
    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    const/16 v2, 0x20

    .line 171
    .line 172
    if-eq v10, v2, :cond_6

    .line 173
    .line 174
    const/16 v2, 0x9

    .line 175
    .line 176
    if-eq v10, v2, :cond_6

    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 180
    .line 181
    const/4 v2, 0x2

    .line 182
    goto :goto_7

    .line 183
    :cond_7
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    :goto_8
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-ge v3, v2, :cond_8

    .line 192
    .line 193
    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    const/16 v6, 0x22

    .line 198
    .line 199
    if-ne v2, v6, :cond_8

    .line 200
    .line 201
    add-int/lit8 v3, v3, 0x1

    .line 202
    .line 203
    const/4 v2, 0x4

    .line 204
    invoke-static {v5, v6, v3, v4, v2}, Lo7/j;->p1(Ljava/lang/CharSequence;CIZI)I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    invoke-virtual {v5, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-static {v3, v1}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const/4 v6, 0x1

    .line 216
    add-int/2addr v2, v6

    .line 217
    move v6, v2

    .line 218
    move-object/from16 v26, v9

    .line 219
    .line 220
    const/4 v9, 0x2

    .line 221
    goto :goto_d

    .line 222
    :cond_8
    const/4 v6, 0x1

    .line 223
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    move v10, v3

    .line 228
    :goto_9
    if-ge v10, v2, :cond_b

    .line 229
    .line 230
    invoke-virtual {v5, v10}, Ljava/lang/String;->charAt(I)C

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    move/from16 v25, v2

    .line 235
    .line 236
    const-string v2, ",;"

    .line 237
    .line 238
    move-object/from16 v26, v9

    .line 239
    .line 240
    const/4 v9, 0x2

    .line 241
    invoke-static {v2, v6, v4, v4, v9}, Lo7/j;->p1(Ljava/lang/CharSequence;CIZI)I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-ltz v2, :cond_9

    .line 246
    .line 247
    const/4 v2, 0x1

    .line 248
    goto :goto_a

    .line 249
    :cond_9
    move v2, v4

    .line 250
    :goto_a
    if-eqz v2, :cond_a

    .line 251
    .line 252
    goto :goto_b

    .line 253
    :cond_a
    add-int/lit8 v10, v10, 0x1

    .line 254
    .line 255
    move/from16 v2, v25

    .line 256
    .line 257
    move-object/from16 v9, v26

    .line 258
    .line 259
    const/4 v6, 0x1

    .line 260
    goto :goto_9

    .line 261
    :cond_b
    move-object/from16 v26, v9

    .line 262
    .line 263
    const/4 v9, 0x2

    .line 264
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    :goto_b
    invoke-virtual {v5, v3, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    invoke-static {v2, v1}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-static {v2}, Lo7/j;->G1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    move v6, v10

    .line 284
    goto :goto_d

    .line 285
    :cond_c
    :goto_c
    move-object/from16 v26, v9

    .line 286
    .line 287
    move v9, v2

    .line 288
    add-int/lit8 v3, v3, 0x1

    .line 289
    .line 290
    move v6, v3

    .line 291
    const/4 v3, 0x0

    .line 292
    :goto_d
    const-string v1, "no-cache"

    .line 293
    .line 294
    invoke-static {v1, v0}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-eqz v1, :cond_d

    .line 299
    .line 300
    const/4 v1, -0x1

    .line 301
    const/4 v11, 0x1

    .line 302
    goto/16 :goto_e

    .line 303
    .line 304
    :cond_d
    const-string v1, "no-store"

    .line 305
    .line 306
    invoke-static {v1, v0}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    if-eqz v1, :cond_e

    .line 311
    .line 312
    const/4 v1, -0x1

    .line 313
    const/4 v12, 0x1

    .line 314
    goto/16 :goto_e

    .line 315
    .line 316
    :cond_e
    const-string v1, "max-age"

    .line 317
    .line 318
    invoke-static {v1, v0}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    if-eqz v1, :cond_f

    .line 323
    .line 324
    const/4 v1, -0x1

    .line 325
    invoke-static {v1, v3}, Lz8/b;->x(ILjava/lang/String;)I

    .line 326
    .line 327
    .line 328
    move-result v13

    .line 329
    goto/16 :goto_e

    .line 330
    .line 331
    :cond_f
    const/4 v1, -0x1

    .line 332
    const-string v2, "s-maxage"

    .line 333
    .line 334
    invoke-static {v2, v0}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    if-eqz v2, :cond_10

    .line 339
    .line 340
    invoke-static {v1, v3}, Lz8/b;->x(ILjava/lang/String;)I

    .line 341
    .line 342
    .line 343
    move-result v14

    .line 344
    goto :goto_e

    .line 345
    :cond_10
    const-string v1, "private"

    .line 346
    .line 347
    invoke-static {v1, v0}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    if-eqz v1, :cond_11

    .line 352
    .line 353
    const/4 v1, -0x1

    .line 354
    const/4 v15, 0x1

    .line 355
    goto :goto_e

    .line 356
    :cond_11
    const-string v1, "public"

    .line 357
    .line 358
    invoke-static {v1, v0}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    if-eqz v1, :cond_12

    .line 363
    .line 364
    const/4 v1, -0x1

    .line 365
    const/16 v16, 0x1

    .line 366
    .line 367
    goto :goto_e

    .line 368
    :cond_12
    const-string v1, "must-revalidate"

    .line 369
    .line 370
    invoke-static {v1, v0}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_13

    .line 375
    .line 376
    const/4 v1, -0x1

    .line 377
    const/16 v17, 0x1

    .line 378
    .line 379
    goto :goto_e

    .line 380
    :cond_13
    const-string v1, "max-stale"

    .line 381
    .line 382
    invoke-static {v1, v0}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    if-eqz v1, :cond_14

    .line 387
    .line 388
    const v0, 0x7fffffff

    .line 389
    .line 390
    .line 391
    invoke-static {v0, v3}, Lz8/b;->x(ILjava/lang/String;)I

    .line 392
    .line 393
    .line 394
    move-result v18

    .line 395
    const/4 v1, -0x1

    .line 396
    goto :goto_e

    .line 397
    :cond_14
    const-string v1, "min-fresh"

    .line 398
    .line 399
    invoke-static {v1, v0}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    if-eqz v1, :cond_15

    .line 404
    .line 405
    const/4 v1, -0x1

    .line 406
    invoke-static {v1, v3}, Lz8/b;->x(ILjava/lang/String;)I

    .line 407
    .line 408
    .line 409
    move-result v19

    .line 410
    goto :goto_e

    .line 411
    :cond_15
    const/4 v1, -0x1

    .line 412
    const-string v2, "only-if-cached"

    .line 413
    .line 414
    invoke-static {v2, v0}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    if-eqz v2, :cond_16

    .line 419
    .line 420
    const/16 v20, 0x1

    .line 421
    .line 422
    goto :goto_e

    .line 423
    :cond_16
    const-string v2, "no-transform"

    .line 424
    .line 425
    invoke-static {v2, v0}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    if-eqz v2, :cond_17

    .line 430
    .line 431
    const/16 v21, 0x1

    .line 432
    .line 433
    goto :goto_e

    .line 434
    :cond_17
    const-string v2, "immutable"

    .line 435
    .line 436
    invoke-static {v2, v0}, Lo7/j;->l1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    if-eqz v0, :cond_18

    .line 441
    .line 442
    const/16 v22, 0x1

    .line 443
    .line 444
    :cond_18
    :goto_e
    move-object/from16 v0, p0

    .line 445
    .line 446
    move v2, v9

    .line 447
    move/from16 v1, v24

    .line 448
    .line 449
    move-object/from16 v9, v26

    .line 450
    .line 451
    goto/16 :goto_3

    .line 452
    .line 453
    :cond_19
    move/from16 v24, v1

    .line 454
    .line 455
    move-object/from16 v26, v9

    .line 456
    .line 457
    const/4 v1, -0x1

    .line 458
    move v9, v2

    .line 459
    move-object/from16 v5, v26

    .line 460
    .line 461
    goto :goto_f

    .line 462
    :cond_1a
    move/from16 v24, v1

    .line 463
    .line 464
    move-object v5, v9

    .line 465
    const/4 v1, -0x1

    .line 466
    move v9, v2

    .line 467
    :goto_f
    add-int/lit8 v7, v7, 0x1

    .line 468
    .line 469
    move-object/from16 v0, p0

    .line 470
    .line 471
    move v2, v9

    .line 472
    move/from16 v1, v24

    .line 473
    .line 474
    move-object v9, v5

    .line 475
    goto/16 :goto_0

    .line 476
    .line 477
    :cond_1b
    move-object v5, v9

    .line 478
    if-nez v8, :cond_1c

    .line 479
    .line 480
    const/16 v23, 0x0

    .line 481
    .line 482
    goto :goto_10

    .line 483
    :cond_1c
    move-object/from16 v23, v5

    .line 484
    .line 485
    :goto_10
    new-instance v0, Ly8/c;

    .line 486
    .line 487
    move-object v10, v0

    .line 488
    invoke-direct/range {v10 .. v23}, Ly8/c;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    .line 489
    .line 490
    .line 491
    return-object v0
.end method

.method public static final u(Landroidx/lifecycle/q0;Ljava/lang/String;)Ly8/g;
    .locals 1

    .line 1
    new-instance p0, Ly8/g;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ly8/g;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ly8/g;->d:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public static y(Lz1/h;Lf1/r;)Lz1/i;
    .locals 4

    .line 1
    iget-object p1, p1, Lf1/r;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/io/IOException;

    .line 4
    .line 5
    instance-of v0, p1, Lh1/y;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    check-cast p1, Lh1/y;

    .line 12
    .line 13
    iget p1, p1, Lh1/y;->d:I

    .line 14
    .line 15
    const/16 v0, 0x193

    .line 16
    .line 17
    if-eq p1, v0, :cond_2

    .line 18
    .line 19
    const/16 v0, 0x194

    .line 20
    .line 21
    if-eq p1, v0, :cond_2

    .line 22
    .line 23
    const/16 v0, 0x19a

    .line 24
    .line 25
    if-eq p1, v0, :cond_2

    .line 26
    .line 27
    const/16 v0, 0x1a0

    .line 28
    .line 29
    if-eq p1, v0, :cond_2

    .line 30
    .line 31
    const/16 v0, 0x1f4

    .line 32
    .line 33
    if-eq p1, v0, :cond_2

    .line 34
    .line 35
    const/16 v0, 0x1f7

    .line 36
    .line 37
    if-ne p1, v0, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    :goto_1
    move p1, v1

    .line 43
    :goto_2
    const/4 v0, 0x0

    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_3
    invoke-virtual {p0, v1}, Lz1/h;->a(I)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    new-instance p0, Lz1/i;

    .line 54
    .line 55
    const-wide/32 v2, 0x493e0

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, v1, v2, v3}, Lz1/i;-><init>(IJ)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_4
    const/4 p1, 0x2

    .line 63
    invoke-virtual {p0, p1}, Lz1/h;->a(I)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_5

    .line 68
    .line 69
    new-instance p0, Lz1/i;

    .line 70
    .line 71
    const-wide/32 v0, 0xea60

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, p1, v0, v1}, Lz1/i;-><init>(IJ)V

    .line 75
    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_5
    return-object v0
.end method


# virtual methods
.method public B(Ljava/lang/String;)Ljava/util/List;
    .locals 3

    .line 1
    const-string v0, "hostname"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p1}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "getAllByName(hostname)"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lx6/i;->o1([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-object p1

    .line 20
    :catch_0
    move-exception v0

    .line 21
    new-instance v1, Ljava/net/UnknownHostException;

    .line 22
    .line 23
    const-string v2, "Broken system behaviour for dns lookup of "

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {v1, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    throw v1
.end method

.method public D(Lc1/v;)Z
    .locals 1

    .line 1
    iget-object p1, p1, Lc1/v;->m:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "application/id3"

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const-string v0, "application/x-emsg"

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-string v0, "application/x-scte35"

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string v0, "application/x-icy"

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    const-string v0, "application/vnd.dvb.ait"

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 p1, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 47
    :goto_1
    return p1
.end method

.method public synthetic a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d(Landroid/os/Looper;Lk1/i0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e([BLjava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f(Lx3/e0;Lv3/l;)Lx3/e0;
    .locals 0

    .line 1
    return-object p1
.end method

.method public g()Ld2/b0;
    .locals 3

    .line 1
    new-instance v0, Ld2/u;

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Ld2/u;-><init>(J)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public h(Ljava/lang/CharSequence;I)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    add-int/2addr p2, v0

    .line 3
    const/4 v1, 0x2

    .line 4
    move v2, v0

    .line 5
    move v3, v1

    .line 6
    :goto_0
    if-ge v2, p2, :cond_2

    .line 7
    .line 8
    if-ne v3, v1, :cond_2

    .line 9
    .line 10
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-static {v3}, Ljava/lang/Character;->getDirectionality(C)B

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    sget-object v4, Le0/l;->a:Le0/k;

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    if-eq v3, v4, :cond_0

    .line 24
    .line 25
    if-eq v3, v1, :cond_0

    .line 26
    .line 27
    packed-switch v3, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move v3, v1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :pswitch_0
    move v3, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :pswitch_1
    move v3, v4

    .line 35
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    return v3

    .line 39
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public i(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public j(Lb4/c0;)Lb4/x;
    .locals 0

    .line 1
    sget-object p1, Lb4/f0;->a:Lb4/f0;

    .line 2
    .line 3
    return-object p1
.end method

.method public synthetic k()V
    .locals 0

    .line 1
    return-void
.end method

.method public l(Lo1/n;Lc1/v;)Lo1/k;
    .locals 2

    .line 1
    iget-object p1, p2, Lc1/v;->p:Lc1/p;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    new-instance p1, Lo1/v;

    .line 8
    .line 9
    new-instance p2, Lo1/j;

    .line 10
    .line 11
    new-instance v0, Lo1/g0;

    .line 12
    .line 13
    invoke-direct {v0}, Lo1/g0;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x1771

    .line 17
    .line 18
    invoke-direct {p2, v1, v0}, Lo1/j;-><init>(ILjava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, p2}, Lo1/v;-><init>(Lo1/j;)V

    .line 22
    .line 23
    .line 24
    return-object p1
.end method

.method public m(Ld2/q;)J
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public bridge synthetic n(Lcom/google/android/gms/common/api/s;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method

.method public o(Lc1/v;)I
    .locals 0

    .line 1
    iget-object p1, p1, Lc1/v;->p:Lc1/p;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    return p1
.end method

.method public p(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public q(Lv3/a;)Ln4/d;
    .locals 0

    .line 1
    sget-object p1, Ln4/b;->a:Ln4/b;

    .line 2
    .line 3
    return-object p1
.end method

.method public synthetic r(Lo1/n;Lc1/v;)Lo1/p;
    .locals 0

    .line 1
    sget-object p1, Lo1/p;->l:Lj1/l;

    return-object p1
.end method

.method public s()V
    .locals 0

    .line 1
    return-void
.end method

.method public t(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public v(Lc1/v;)Lr6/h0;
    .locals 4

    .line 1
    iget-object p1, p1, Lc1/v;->m:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, -0x1

    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    sparse-switch v3, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :sswitch_0
    const-string v3, "application/x-scte35"

    .line 20
    .line 21
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x4

    .line 29
    goto :goto_0

    .line 30
    :sswitch_1
    const-string v3, "application/x-emsg"

    .line 31
    .line 32
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v2, 0x3

    .line 40
    goto :goto_0

    .line 41
    :sswitch_2
    const-string v3, "application/id3"

    .line 42
    .line 43
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v2, 0x2

    .line 51
    goto :goto_0

    .line 52
    :sswitch_3
    const-string v3, "application/x-icy"

    .line 53
    .line 54
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const/4 v2, 0x1

    .line 62
    goto :goto_0

    .line 63
    :sswitch_4
    const-string v3, "application/vnd.dvb.ait"

    .line 64
    .line 65
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    const/4 v2, 0x0

    .line 73
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :pswitch_0
    new-instance p1, Ls2/c;

    .line 78
    .line 79
    invoke-direct {p1}, Ls2/c;-><init>()V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :pswitch_1
    new-instance p1, Lm2/b;

    .line 84
    .line 85
    invoke-direct {p1, v1}, Lm2/b;-><init>(I)V

    .line 86
    .line 87
    .line 88
    return-object p1

    .line 89
    :pswitch_2
    new-instance p1, Lq2/j;

    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    invoke-direct {p1, v0}, Lq2/j;-><init>(Lj1/l;)V

    .line 93
    .line 94
    .line 95
    return-object p1

    .line 96
    :pswitch_3
    new-instance p1, Lp2/a;

    .line 97
    .line 98
    invoke-direct {p1}, Lp2/a;-><init>()V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    :pswitch_4
    new-instance p1, Lm2/b;

    .line 103
    .line 104
    invoke-direct {p1, v0}, Lm2/b;-><init>(I)V

    .line 105
    .line 106
    .line 107
    return-object p1

    .line 108
    :cond_5
    :goto_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 109
    .line 110
    const-string v1, "Attempted to create decoder for unsupported MIME type: "

    .line 111
    .line 112
    invoke-static {v1, p1}, Lr/f;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    nop

    .line 121
    :sswitch_data_0
    .sparse-switch
        -0x50bb4913 -> :sswitch_4
        -0x505c61b5 -> :sswitch_3
        -0x4a682ec7 -> :sswitch_2
        0x44ce7ed0 -> :sswitch_1
        0x62816bb7 -> :sswitch_0
    .end sparse-switch

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public w([Ly1/q;Lz1/c;)[Ly1/s;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Ly1/b;->v([Ly1/q;)Lr6/n1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    array-length v2, v0

    .line 8
    new-array v2, v2, [Ly1/s;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    move v4, v3

    .line 12
    :goto_0
    array-length v5, v0

    .line 13
    if-ge v4, v5, :cond_3

    .line 14
    .line 15
    aget-object v5, v0, v4

    .line 16
    .line 17
    if-eqz v5, :cond_2

    .line 18
    .line 19
    iget-object v8, v5, Ly1/q;->b:[I

    .line 20
    .line 21
    array-length v6, v8

    .line 22
    if-nez v6, :cond_0

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    array-length v6, v8

    .line 26
    const/4 v7, 0x1

    .line 27
    if-ne v6, v7, :cond_1

    .line 28
    .line 29
    new-instance v6, Ly1/t;

    .line 30
    .line 31
    aget v7, v8, v3

    .line 32
    .line 33
    iget v8, v5, Ly1/q;->c:I

    .line 34
    .line 35
    iget-object v5, v5, Ly1/q;->a:Lc1/f1;

    .line 36
    .line 37
    invoke-direct {v6, v7, v8, v5}, Ly1/t;-><init>(IILc1/f1;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget-object v7, v5, Ly1/q;->a:Lc1/f1;

    .line 42
    .line 43
    iget v9, v5, Ly1/q;->c:I

    .line 44
    .line 45
    invoke-virtual {v1, v4}, Lr6/n1;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    move-object/from16 v21, v5

    .line 50
    .line 51
    check-cast v21, Lr6/o0;

    .line 52
    .line 53
    new-instance v5, Ly1/b;

    .line 54
    .line 55
    move-object v6, v5

    .line 56
    const/16 v10, 0x2710

    .line 57
    .line 58
    int-to-long v11, v10

    .line 59
    const/16 v10, 0x61a8

    .line 60
    .line 61
    int-to-long v13, v10

    .line 62
    move-wide v15, v13

    .line 63
    const/16 v17, 0x4ff

    .line 64
    .line 65
    const/16 v18, 0x2cf

    .line 66
    .line 67
    const v19, 0x3f333333    # 0.7f

    .line 68
    .line 69
    .line 70
    const/high16 v20, 0x3f400000    # 0.75f

    .line 71
    .line 72
    sget-object v22, Lf1/a;->a:Lf1/v;

    .line 73
    .line 74
    move-object/from16 v10, p2

    .line 75
    .line 76
    invoke-direct/range {v6 .. v22}, Ly1/b;-><init>(Lc1/f1;[IILz1/c;JJJIIFFLr6/o0;Lf1/a;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    aput-object v6, v2, v4

    .line 80
    .line 81
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    return-object v2
.end method

.method public declared-synchronized x(Ljava/lang/String;)Ly8/g;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "javaName"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Ly8/g;->d:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ly8/g;

    .line 14
    .line 15
    if-nez v1, :cond_3

    .line 16
    .line 17
    const-string v1, "TLS_"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {p1, v1, v2}, Lo7/j;->C1(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const-string v4, "this as java.lang.String).substring(startIndex)"

    .line 25
    .line 26
    const-string v5, "SSL_"

    .line 27
    .line 28
    const/4 v6, 0x4

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1, v4}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {p1, v5, v2}, Lo7/j;->C1(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2, v4}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move-object v1, p1

    .line 62
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ly8/g;

    .line 67
    .line 68
    if-nez v1, :cond_2

    .line 69
    .line 70
    new-instance v1, Ly8/g;

    .line 71
    .line 72
    invoke-direct {v1, p1}, Ly8/g;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    :cond_3
    monitor-exit p0

    .line 79
    return-object v1

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    monitor-exit p0

    .line 82
    throw p1
.end method

.method public z(I)I
    .locals 1

    .line 1
    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    const/4 p1, 0x6

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    :goto_0
    return p1
.end method
