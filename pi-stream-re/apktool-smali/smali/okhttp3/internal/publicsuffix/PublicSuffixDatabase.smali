.class public final Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:[B

.field public static final f:Ljava/util/List;

.field public static final g:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Ljava/util/concurrent/CountDownLatch;

.field public c:[B

.field public d:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lf9/x;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lf9/x;-><init>(II)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    const/16 v1, 0x2a

    .line 13
    .line 14
    aput-byte v1, v0, v2

    .line 15
    .line 16
    sput-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->e:[B

    .line 17
    .line 18
    const-string v0, "*"

    .line 19
    .line 20
    invoke-static {v0}, Lcom/bumptech/glide/c;->L(Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->f:Ljava/util/List;

    .line 25
    .line 26
    new-instance v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    .line 27
    .line 28
    invoke-direct {v0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;-><init>()V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->g:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b:Ljava/util/concurrent/CountDownLatch;

    .line 19
    .line 20
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x2e

    .line 6
    .line 7
    aput-char v3, v1, v2

    .line 8
    .line 9
    invoke-static {p0, v1}, Lo7/j;->A1(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    invoke-static {p0}, Lcom/bumptech/glide/c;->w(Ljava/util/List;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v3, ""

    .line 28
    .line 29
    invoke-static {v1, v3}, Lr6/h0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    sub-int/2addr v1, v0

    .line 40
    if-gez v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v2, v1

    .line 44
    :goto_0
    invoke-static {p0, v2}, Lx6/m;->t0(Ljava/util/List;I)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :cond_1
    return-object p0

    .line 49
    :cond_2
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 50
    .line 51
    const-string v0, "List is empty."

    .line 52
    .line 53
    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-static {p1}, Ljava/net/IDN;->toUnicode(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "unicodeDomain"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c(Ljava/lang/String;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    move v1, v2

    .line 33
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b()V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_2

    .line 41
    :catch_0
    move-exception v4

    .line 42
    :try_start_1
    sget-object v5, Lg9/l;->a:Lg9/l;

    .line 43
    .line 44
    sget-object v5, Lg9/l;->a:Lg9/l;

    .line 45
    .line 46
    const-string v6, "Failed to read public suffix list"

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const/4 v5, 0x5

    .line 52
    invoke-static {v5, v6, v4}, Lg9/l;->i(ILjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :catch_1
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    .line 67
    .line 68
    move v1, v3

    .line 69
    goto :goto_0

    .line 70
    :goto_2
    if-eqz v1, :cond_0

    .line 71
    .line 72
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 77
    .line 78
    .line 79
    :cond_0
    throw p1

    .line 80
    :cond_1
    :try_start_3
    iget-object v1, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b:Ljava/util/concurrent/CountDownLatch;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catch_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_3
    iget-object v1, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c:[B

    .line 94
    .line 95
    if-eqz v1, :cond_3

    .line 96
    .line 97
    move v1, v3

    .line 98
    goto :goto_4

    .line 99
    :cond_3
    move v1, v2

    .line 100
    :goto_4
    if-eqz v1, :cond_1c

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    new-array v4, v1, [[B

    .line 107
    .line 108
    move v5, v2

    .line 109
    :goto_5
    if-ge v5, v1, :cond_4

    .line 110
    .line 111
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    check-cast v6, Ljava/lang/String;

    .line 116
    .line 117
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 118
    .line 119
    const-string v8, "UTF_8"

    .line 120
    .line 121
    invoke-static {v7, v8}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    const-string v7, "this as java.lang.String).getBytes(charset)"

    .line 129
    .line 130
    invoke-static {v6, v7}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    aput-object v6, v4, v5

    .line 134
    .line 135
    add-int/lit8 v5, v5, 0x1

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_4
    move v5, v2

    .line 139
    :goto_6
    const/4 v6, 0x0

    .line 140
    const-string v7, "publicSuffixListBytes"

    .line 141
    .line 142
    if-ge v5, v1, :cond_7

    .line 143
    .line 144
    iget-object v8, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c:[B

    .line 145
    .line 146
    if-eqz v8, :cond_6

    .line 147
    .line 148
    invoke-static {v8, v4, v5}, Lf9/x;->k([B[[BI)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    if-eqz v8, :cond_5

    .line 153
    .line 154
    goto :goto_7

    .line 155
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_6
    invoke-static {v7}, Lr6/h0;->X0(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw v6

    .line 162
    :cond_7
    move-object v8, v6

    .line 163
    :goto_7
    if-le v1, v3, :cond_a

    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    check-cast v5, [[B

    .line 170
    .line 171
    array-length v9, v5

    .line 172
    sub-int/2addr v9, v3

    .line 173
    move v10, v2

    .line 174
    :goto_8
    if-ge v10, v9, :cond_a

    .line 175
    .line 176
    sget-object v11, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->e:[B

    .line 177
    .line 178
    aput-object v11, v5, v10

    .line 179
    .line 180
    iget-object v11, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c:[B

    .line 181
    .line 182
    if-eqz v11, :cond_9

    .line 183
    .line 184
    invoke-static {v11, v5, v10}, Lf9/x;->k([B[[BI)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v11

    .line 188
    if-eqz v11, :cond_8

    .line 189
    .line 190
    goto :goto_9

    .line 191
    :cond_8
    add-int/lit8 v10, v10, 0x1

    .line 192
    .line 193
    goto :goto_8

    .line 194
    :cond_9
    invoke-static {v7}, Lr6/h0;->X0(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v6

    .line 198
    :cond_a
    move-object v11, v6

    .line 199
    :goto_9
    if-eqz v11, :cond_d

    .line 200
    .line 201
    sub-int/2addr v1, v3

    .line 202
    move v5, v2

    .line 203
    :goto_a
    if-ge v5, v1, :cond_d

    .line 204
    .line 205
    iget-object v7, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->d:[B

    .line 206
    .line 207
    if-eqz v7, :cond_c

    .line 208
    .line 209
    invoke-static {v7, v4, v5}, Lf9/x;->k([B[[BI)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    if-eqz v7, :cond_b

    .line 214
    .line 215
    goto :goto_b

    .line 216
    :cond_b
    add-int/lit8 v5, v5, 0x1

    .line 217
    .line 218
    goto :goto_a

    .line 219
    :cond_c
    const-string p1, "publicSuffixExceptionListBytes"

    .line 220
    .line 221
    invoke-static {p1}, Lr6/h0;->X0(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v6

    .line 225
    :cond_d
    move-object v7, v6

    .line 226
    :goto_b
    const/16 v1, 0x2e

    .line 227
    .line 228
    if-eqz v7, :cond_e

    .line 229
    .line 230
    const-string v4, "!"

    .line 231
    .line 232
    invoke-virtual {v4, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    new-array v5, v3, [C

    .line 237
    .line 238
    aput-char v1, v5, v2

    .line 239
    .line 240
    invoke-static {v4, v5}, Lo7/j;->A1(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    goto :goto_e

    .line 245
    :cond_e
    if-nez v8, :cond_f

    .line 246
    .line 247
    if-nez v11, :cond_f

    .line 248
    .line 249
    sget-object v1, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->f:Ljava/util/List;

    .line 250
    .line 251
    goto :goto_e

    .line 252
    :cond_f
    sget-object v4, Lx6/o;->a:Lx6/o;

    .line 253
    .line 254
    if-eqz v8, :cond_10

    .line 255
    .line 256
    new-array v5, v3, [C

    .line 257
    .line 258
    aput-char v1, v5, v2

    .line 259
    .line 260
    invoke-static {v8, v5}, Lo7/j;->A1(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    goto :goto_c

    .line 265
    :cond_10
    move-object v5, v4

    .line 266
    :goto_c
    if-eqz v11, :cond_11

    .line 267
    .line 268
    new-array v4, v3, [C

    .line 269
    .line 270
    aput-char v1, v4, v2

    .line 271
    .line 272
    invoke-static {v11, v4}, Lo7/j;->A1(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    goto :goto_d

    .line 277
    :cond_11
    move-object v1, v4

    .line 278
    :goto_d
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    if-le v4, v7, :cond_12

    .line 287
    .line 288
    move-object v1, v5

    .line 289
    :cond_12
    :goto_e
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    const/16 v7, 0x21

    .line 298
    .line 299
    if-ne v4, v5, :cond_13

    .line 300
    .line 301
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    check-cast v4, Ljava/lang/String;

    .line 306
    .line 307
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-eq v4, v7, :cond_13

    .line 312
    .line 313
    return-object v6

    .line 314
    :cond_13
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    check-cast v4, Ljava/lang/String;

    .line 319
    .line 320
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    .line 321
    .line 322
    .line 323
    move-result v4

    .line 324
    if-ne v4, v7, :cond_14

    .line 325
    .line 326
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    goto :goto_f

    .line 335
    :cond_14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    add-int/2addr v1, v3

    .line 344
    :goto_f
    sub-int/2addr v0, v1

    .line 345
    invoke-static {p1}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c(Ljava/lang/String;)Ljava/util/List;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    new-instance v1, Lg0/d1;

    .line 350
    .line 351
    invoke-direct {v1, p1, v3}, Lg0/d1;-><init>(Ljava/lang/Object;I)V

    .line 352
    .line 353
    .line 354
    if-ltz v0, :cond_15

    .line 355
    .line 356
    move p1, v3

    .line 357
    goto :goto_10

    .line 358
    :cond_15
    move p1, v2

    .line 359
    :goto_10
    if-eqz p1, :cond_1b

    .line 360
    .line 361
    if-nez v0, :cond_16

    .line 362
    .line 363
    goto :goto_12

    .line 364
    :cond_16
    instance-of p1, v1, Ln7/b;

    .line 365
    .line 366
    if-eqz p1, :cond_18

    .line 367
    .line 368
    check-cast v1, Ln7/b;

    .line 369
    .line 370
    iget p1, v1, Ln7/b;->b:I

    .line 371
    .line 372
    add-int/2addr p1, v0

    .line 373
    if-gez p1, :cond_17

    .line 374
    .line 375
    new-instance p1, Ln7/b;

    .line 376
    .line 377
    invoke-direct {p1, v1, v0}, Ln7/b;-><init>(Ln7/c;I)V

    .line 378
    .line 379
    .line 380
    goto :goto_11

    .line 381
    :cond_17
    new-instance v0, Ln7/b;

    .line 382
    .line 383
    iget-object v1, v1, Ln7/b;->a:Ln7/c;

    .line 384
    .line 385
    invoke-direct {v0, v1, p1}, Ln7/b;-><init>(Ln7/c;I)V

    .line 386
    .line 387
    .line 388
    move-object v1, v0

    .line 389
    goto :goto_12

    .line 390
    :cond_18
    new-instance p1, Ln7/b;

    .line 391
    .line 392
    invoke-direct {p1, v1, v0}, Ln7/b;-><init>(Ln7/c;I)V

    .line 393
    .line 394
    .line 395
    :goto_11
    move-object v1, p1

    .line 396
    :goto_12
    new-instance p1, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    const-string v0, ""

    .line 402
    .line 403
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 404
    .line 405
    .line 406
    invoke-interface {v1}, Ln7/c;->iterator()Ljava/util/Iterator;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 411
    .line 412
    .line 413
    move-result v4

    .line 414
    if-eqz v4, :cond_1a

    .line 415
    .line 416
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    add-int/2addr v2, v3

    .line 421
    if-le v2, v3, :cond_19

    .line 422
    .line 423
    const-string v5, "."

    .line 424
    .line 425
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 426
    .line 427
    .line 428
    :cond_19
    invoke-static {p1, v4, v6}, Lr6/h0;->f(Ljava/lang/StringBuilder;Ljava/lang/Object;Lh7/l;)V

    .line 429
    .line 430
    .line 431
    goto :goto_13

    .line 432
    :cond_1a
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 433
    .line 434
    .line 435
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    const-string v0, "toString(...)"

    .line 440
    .line 441
    invoke-static {p1, v0}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    return-object p1

    .line 445
    :cond_1b
    const-string p1, "Requested element count "

    .line 446
    .line 447
    const-string v1, " is less than zero."

    .line 448
    .line 449
    invoke-static {p1, v0, v1}, La3/g;->o(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object p1

    .line 453
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 454
    .line 455
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw v0

    .line 463
    :cond_1c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 464
    .line 465
    const-string v0, "Unable to load publicsuffixes.gz resource from the classpath."

    .line 466
    .line 467
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    throw p1
.end method

.method public final b()V
    .locals 5

    .line 1
    :try_start_0
    const-class v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    .line 2
    .line 3
    const-string v1, "publicsuffixes.gz"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b:Ljava/util/concurrent/CountDownLatch;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    :try_start_1
    new-instance v1, Lk9/l;

    .line 18
    .line 19
    sget-object v2, Lk9/n;->a:Ljava/util/logging/Logger;

    .line 20
    .line 21
    new-instance v2, Lk9/d;

    .line 22
    .line 23
    new-instance v3, Lk9/y;

    .line 24
    .line 25
    invoke-direct {v3}, Lk9/y;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v0, v3}, Lk9/d;-><init>(Ljava/io/InputStream;Lk9/y;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v2}, Lk9/l;-><init>(Lk9/w;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lk9/q;

    .line 35
    .line 36
    invoke-direct {v0, v1}, Lk9/q;-><init>(Lk9/w;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 37
    .line 38
    .line 39
    :try_start_2
    invoke-virtual {v0}, Lk9/q;->readInt()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    int-to-long v1, v1

    .line 44
    invoke-virtual {v0, v1, v2}, Lk9/q;->A(J)V

    .line 45
    .line 46
    .line 47
    iget-object v3, v0, Lk9/q;->b:Lk9/g;

    .line 48
    .line 49
    invoke-virtual {v3, v1, v2}, Lk9/g;->v(J)[B

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0}, Lk9/q;->readInt()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    int-to-long v2, v2

    .line 58
    invoke-virtual {v0, v2, v3}, Lk9/q;->A(J)V

    .line 59
    .line 60
    .line 61
    iget-object v4, v0, Lk9/q;->b:Lk9/g;

    .line 62
    .line 63
    invoke-virtual {v4, v2, v3}, Lk9/g;->v(J)[B

    .line 64
    .line 65
    .line 66
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    const/4 v3, 0x0

    .line 68
    :try_start_3
    invoke-static {v0, v3}, Lr6/h0;->A(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    monitor-enter p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 72
    :try_start_4
    iput-object v1, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->c:[B

    .line 73
    .line 74
    iput-object v2, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->d:[B
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 75
    .line 76
    :try_start_5
    monitor-exit p0

    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    monitor-exit p0

    .line 80
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 81
    :catchall_1
    move-exception v1

    .line 82
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 83
    :catchall_2
    move-exception v2

    .line 84
    :try_start_7
    invoke-static {v0, v1}, Lr6/h0;->A(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 88
    :catchall_3
    move-exception v0

    .line 89
    iget-object v1, p0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b:Ljava/util/concurrent/CountDownLatch;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 92
    .line 93
    .line 94
    throw v0
.end method
