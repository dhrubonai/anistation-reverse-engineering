.class final Lcom/google/android/gms/internal/auth/zzhi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final zza:Z

.field private static final zzb:Lsun/misc/Unsafe;

.field private static final zzc:Ljava/lang/Class;

.field private static final zzd:Z

.field private static final zze:Lcom/google/android/gms/internal/auth/zzhh;

.field private static final zzf:Z

.field private static final zzg:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 1
    const-class v0, Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhi;->zzg()Lsun/misc/Unsafe;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sput-object v1, Lcom/google/android/gms/internal/auth/zzhi;->zzb:Lsun/misc/Unsafe;

    .line 8
    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzdr;->zza()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sput-object v2, Lcom/google/android/gms/internal/auth/zzhi;->zzc:Ljava/lang/Class;

    .line 14
    .line 15
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-static {v2}, Lcom/google/android/gms/internal/auth/zzhi;->zzs(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    sput-boolean v3, Lcom/google/android/gms/internal/auth/zzhi;->zzd:Z

    .line 22
    .line 23
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-static {v4}, Lcom/google/android/gms/internal/auth/zzhi;->zzs(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/4 v5, 0x0

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    if-eqz v3, :cond_1

    .line 34
    .line 35
    new-instance v5, Lcom/google/android/gms/internal/auth/zzhg;

    .line 36
    .line 37
    invoke-direct {v5, v1}, Lcom/google/android/gms/internal/auth/zzhg;-><init>(Lsun/misc/Unsafe;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    if-eqz v4, :cond_2

    .line 42
    .line 43
    new-instance v5, Lcom/google/android/gms/internal/auth/zzhf;

    .line 44
    .line 45
    invoke-direct {v5, v1}, Lcom/google/android/gms/internal/auth/zzhf;-><init>(Lsun/misc/Unsafe;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    sput-object v5, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 49
    .line 50
    const-string v1, "getLong"

    .line 51
    .line 52
    const-string v3, "objectFieldOffset"

    .line 53
    .line 54
    const-class v4, Ljava/lang/reflect/Field;

    .line 55
    .line 56
    const/4 v6, 0x2

    .line 57
    const-class v7, Ljava/lang/Object;

    .line 58
    .line 59
    const/4 v8, 0x1

    .line 60
    const/4 v9, 0x0

    .line 61
    if-nez v5, :cond_3

    .line 62
    .line 63
    :goto_1
    move v2, v9

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    iget-object v5, v5, Lcom/google/android/gms/internal/auth/zzhh;->zza:Lsun/misc/Unsafe;

    .line 66
    .line 67
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    new-array v10, v8, [Ljava/lang/Class;

    .line 72
    .line 73
    aput-object v4, v10, v9

    .line 74
    .line 75
    invoke-virtual {v5, v3, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    new-array v10, v6, [Ljava/lang/Class;

    .line 79
    .line 80
    aput-object v7, v10, v9

    .line 81
    .line 82
    aput-object v2, v10, v8

    .line 83
    .line 84
    invoke-virtual {v5, v1, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 85
    .line 86
    .line 87
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhi;->zzy()Ljava/lang/reflect/Field;

    .line 88
    .line 89
    .line 90
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    if-nez v2, :cond_4

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    move v2, v8

    .line 95
    goto :goto_2

    .line 96
    :catchall_0
    move-exception v2

    .line 97
    invoke-static {v2}, Lcom/google/android/gms/internal/auth/zzhi;->zzh(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :goto_2
    sput-boolean v2, Lcom/google/android/gms/internal/auth/zzhi;->zzf:Z

    .line 102
    .line 103
    sget-object v2, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 104
    .line 105
    if-nez v2, :cond_5

    .line 106
    .line 107
    :goto_3
    move v0, v9

    .line 108
    goto :goto_4

    .line 109
    :cond_5
    iget-object v2, v2, Lcom/google/android/gms/internal/auth/zzhh;->zza:Lsun/misc/Unsafe;

    .line 110
    .line 111
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    new-array v5, v8, [Ljava/lang/Class;

    .line 116
    .line 117
    aput-object v4, v5, v9

    .line 118
    .line 119
    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 120
    .line 121
    .line 122
    new-array v3, v8, [Ljava/lang/Class;

    .line 123
    .line 124
    aput-object v0, v3, v9

    .line 125
    .line 126
    const-string v4, "arrayBaseOffset"

    .line 127
    .line 128
    invoke-virtual {v2, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 129
    .line 130
    .line 131
    new-array v3, v8, [Ljava/lang/Class;

    .line 132
    .line 133
    aput-object v0, v3, v9

    .line 134
    .line 135
    const-string v0, "arrayIndexScale"

    .line 136
    .line 137
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 138
    .line 139
    .line 140
    new-array v0, v6, [Ljava/lang/Class;

    .line 141
    .line 142
    aput-object v7, v0, v9

    .line 143
    .line 144
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 145
    .line 146
    aput-object v3, v0, v8

    .line 147
    .line 148
    const-string v4, "getInt"

    .line 149
    .line 150
    invoke-virtual {v2, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 151
    .line 152
    .line 153
    const/4 v0, 0x3

    .line 154
    new-array v4, v0, [Ljava/lang/Class;

    .line 155
    .line 156
    aput-object v7, v4, v9

    .line 157
    .line 158
    aput-object v3, v4, v8

    .line 159
    .line 160
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 161
    .line 162
    aput-object v5, v4, v6

    .line 163
    .line 164
    const-string v5, "putInt"

    .line 165
    .line 166
    invoke-virtual {v2, v5, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 167
    .line 168
    .line 169
    new-array v4, v6, [Ljava/lang/Class;

    .line 170
    .line 171
    aput-object v7, v4, v9

    .line 172
    .line 173
    aput-object v3, v4, v8

    .line 174
    .line 175
    invoke-virtual {v2, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 176
    .line 177
    .line 178
    new-array v1, v0, [Ljava/lang/Class;

    .line 179
    .line 180
    aput-object v7, v1, v9

    .line 181
    .line 182
    aput-object v3, v1, v8

    .line 183
    .line 184
    aput-object v3, v1, v6

    .line 185
    .line 186
    const-string v4, "putLong"

    .line 187
    .line 188
    invoke-virtual {v2, v4, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 189
    .line 190
    .line 191
    new-array v1, v6, [Ljava/lang/Class;

    .line 192
    .line 193
    aput-object v7, v1, v9

    .line 194
    .line 195
    aput-object v3, v1, v8

    .line 196
    .line 197
    const-string v4, "getObject"

    .line 198
    .line 199
    invoke-virtual {v2, v4, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 200
    .line 201
    .line 202
    new-array v0, v0, [Ljava/lang/Class;

    .line 203
    .line 204
    aput-object v7, v0, v9

    .line 205
    .line 206
    aput-object v3, v0, v8

    .line 207
    .line 208
    aput-object v7, v0, v6

    .line 209
    .line 210
    const-string v1, "putObject"

    .line 211
    .line 212
    invoke-virtual {v2, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 213
    .line 214
    .line 215
    move v0, v8

    .line 216
    goto :goto_4

    .line 217
    :catchall_1
    move-exception v0

    .line 218
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzh(Ljava/lang/Throwable;)V

    .line 219
    .line 220
    .line 221
    goto :goto_3

    .line 222
    :goto_4
    sput-boolean v0, Lcom/google/android/gms/internal/auth/zzhi;->zzg:Z

    .line 223
    .line 224
    const-class v0, [B

    .line 225
    .line 226
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    .line 227
    .line 228
    .line 229
    const-class v0, [Z

    .line 230
    .line 231
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    .line 232
    .line 233
    .line 234
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzx(Ljava/lang/Class;)I

    .line 235
    .line 236
    .line 237
    const-class v0, [I

    .line 238
    .line 239
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    .line 240
    .line 241
    .line 242
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzx(Ljava/lang/Class;)I

    .line 243
    .line 244
    .line 245
    const-class v0, [J

    .line 246
    .line 247
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    .line 248
    .line 249
    .line 250
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzx(Ljava/lang/Class;)I

    .line 251
    .line 252
    .line 253
    const-class v0, [F

    .line 254
    .line 255
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    .line 256
    .line 257
    .line 258
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzx(Ljava/lang/Class;)I

    .line 259
    .line 260
    .line 261
    const-class v0, [D

    .line 262
    .line 263
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    .line 264
    .line 265
    .line 266
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzx(Ljava/lang/Class;)I

    .line 267
    .line 268
    .line 269
    const-class v0, [Ljava/lang/Object;

    .line 270
    .line 271
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzw(Ljava/lang/Class;)I

    .line 272
    .line 273
    .line 274
    invoke-static {v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzx(Ljava/lang/Class;)I

    .line 275
    .line 276
    .line 277
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhi;->zzy()Ljava/lang/reflect/Field;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    if-eqz v0, :cond_6

    .line 282
    .line 283
    sget-object v1, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 284
    .line 285
    if-eqz v1, :cond_6

    .line 286
    .line 287
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/auth/zzhh;->zzk(Ljava/lang/reflect/Field;)J

    .line 288
    .line 289
    .line 290
    :cond_6
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 295
    .line 296
    if-ne v0, v1, :cond_7

    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_7
    move v8, v9

    .line 300
    :goto_5
    sput-boolean v8, Lcom/google/android/gms/internal/auth/zzhi;->zza:Z

    .line 301
    .line 302
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zza(Ljava/lang/Object;J)D
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhh;->zza(Ljava/lang/Object;J)D

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public static zzb(Ljava/lang/Object;J)F
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhh;->zzb(Ljava/lang/Object;J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static zzc(Ljava/lang/Object;J)I
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhh;->zzi(Ljava/lang/Object;J)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static zzd(Ljava/lang/Object;J)J
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhh;->zzj(Ljava/lang/Object;J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public static zze(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zzb:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->allocateInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public static zzf(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhh;->zzl(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static zzg()Lsun/misc/Unsafe;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/auth/zzhe;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/zzhe;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lsun/misc/Unsafe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    return-object v0
.end method

.method public static bridge synthetic zzh(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    const-class v0, Lcom/google/android/gms/internal/auth/zzhi;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 12
    .line 13
    const-string v2, "platform method missing - proto runtime falling back to safer methods: "

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string v2, "com.google.protobuf.UnsafeUtil"

    .line 24
    .line 25
    const-string v3, "logMissingMethod"

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v3, p0}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic zzi(Ljava/lang/Object;JZ)V
    .locals 4

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 5
    .line 6
    invoke-virtual {v2, p0, v0, v1}, Lcom/google/android/gms/internal/auth/zzhh;->zzi(Ljava/lang/Object;J)I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    long-to-int p1, p1

    .line 11
    not-int p1, p1

    .line 12
    and-int/lit8 p1, p1, 0x3

    .line 13
    .line 14
    shl-int/lit8 p1, p1, 0x3

    .line 15
    .line 16
    const/16 p2, 0xff

    .line 17
    .line 18
    shl-int/2addr p2, p1

    .line 19
    not-int p2, p2

    .line 20
    and-int/2addr p2, v3

    .line 21
    shl-int p1, p3, p1

    .line 22
    .line 23
    or-int/2addr p1, p2

    .line 24
    invoke-virtual {v2, p0, v0, v1, p1}, Lcom/google/android/gms/internal/auth/zzhh;->zzm(Ljava/lang/Object;JI)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static synthetic zzj(Ljava/lang/Object;JZ)V
    .locals 4

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 5
    .line 6
    invoke-virtual {v2, p0, v0, v1}, Lcom/google/android/gms/internal/auth/zzhh;->zzi(Ljava/lang/Object;J)I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    long-to-int p1, p1

    .line 11
    and-int/lit8 p1, p1, 0x3

    .line 12
    .line 13
    shl-int/lit8 p1, p1, 0x3

    .line 14
    .line 15
    const/16 p2, 0xff

    .line 16
    .line 17
    shl-int/2addr p2, p1

    .line 18
    not-int p2, p2

    .line 19
    and-int/2addr p2, v3

    .line 20
    shl-int p1, p3, p1

    .line 21
    .line 22
    or-int/2addr p1, p2

    .line 23
    invoke-virtual {v2, p0, v0, v1, p1}, Lcom/google/android/gms/internal/auth/zzhh;->zzm(Ljava/lang/Object;JI)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static zzk(Ljava/lang/Object;JZ)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/auth/zzhh;->zzc(Ljava/lang/Object;JZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static zzl(Ljava/lang/Object;JD)V
    .locals 6

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-wide v2, p1

    .line 5
    move-wide v4, p3

    .line 6
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/zzhh;->zzd(Ljava/lang/Object;JD)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static zzm(Ljava/lang/Object;JF)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/auth/zzhh;->zze(Ljava/lang/Object;JF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static zzn(Ljava/lang/Object;JI)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/auth/zzhh;->zzm(Ljava/lang/Object;JI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static zzo(Ljava/lang/Object;JJ)V
    .locals 6

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-wide v2, p1

    .line 5
    move-wide v4, p3

    .line 6
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/auth/zzhh;->zzn(Ljava/lang/Object;JJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static zzp(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/auth/zzhh;->zzo(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static bridge synthetic zzq(Ljava/lang/Object;J)Z
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    const-wide/16 v1, -0x4

    .line 4
    .line 5
    and-long/2addr v1, p1

    .line 6
    invoke-virtual {v0, p0, v1, v2}, Lcom/google/android/gms/internal/auth/zzhh;->zzi(Ljava/lang/Object;J)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    not-long p1, p1

    .line 11
    const-wide/16 v0, 0x3

    .line 12
    .line 13
    and-long/2addr p1, v0

    .line 14
    const/4 v0, 0x3

    .line 15
    shl-long/2addr p1, v0

    .line 16
    long-to-int p1, p1

    .line 17
    ushr-int/2addr p0, p1

    .line 18
    and-int/lit16 p0, p0, 0xff

    .line 19
    .line 20
    int-to-byte p0, p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public static bridge synthetic zzr(Ljava/lang/Object;J)Z
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    const-wide/16 v1, -0x4

    .line 4
    .line 5
    and-long/2addr v1, p1

    .line 6
    invoke-virtual {v0, p0, v1, v2}, Lcom/google/android/gms/internal/auth/zzhh;->zzi(Ljava/lang/Object;J)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const-wide/16 v0, 0x3

    .line 11
    .line 12
    and-long/2addr p1, v0

    .line 13
    const/4 v0, 0x3

    .line 14
    shl-long/2addr p1, v0

    .line 15
    long-to-int p1, p1

    .line 16
    ushr-int/2addr p0, p1

    .line 17
    and-int/lit16 p0, p0, 0xff

    .line 18
    .line 19
    int-to-byte p0, p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public static zzs(Ljava/lang/Class;)Z
    .locals 10

    .line 1
    const-class v0, [B

    .line 2
    .line 3
    sget v1, Lcom/google/android/gms/internal/auth/zzdr;->zza:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    sget-object v2, Lcom/google/android/gms/internal/auth/zzhi;->zzc:Ljava/lang/Class;

    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    new-array v4, v3, [Ljava/lang/Class;

    .line 10
    .line 11
    aput-object p0, v4, v1

    .line 12
    .line 13
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    aput-object v5, v4, v6

    .line 17
    .line 18
    const-string v7, "peekLong"

    .line 19
    .line 20
    invoke-virtual {v2, v7, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x3

    .line 24
    new-array v7, v4, [Ljava/lang/Class;

    .line 25
    .line 26
    aput-object p0, v7, v1

    .line 27
    .line 28
    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    aput-object v8, v7, v6

    .line 31
    .line 32
    aput-object v5, v7, v3

    .line 33
    .line 34
    const-string v8, "pokeLong"

    .line 35
    .line 36
    invoke-virtual {v2, v8, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    new-array v7, v4, [Ljava/lang/Class;

    .line 40
    .line 41
    aput-object p0, v7, v1

    .line 42
    .line 43
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    aput-object v8, v7, v6

    .line 46
    .line 47
    aput-object v5, v7, v3

    .line 48
    .line 49
    const-string v9, "pokeInt"

    .line 50
    .line 51
    invoke-virtual {v2, v9, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 52
    .line 53
    .line 54
    new-array v7, v3, [Ljava/lang/Class;

    .line 55
    .line 56
    aput-object p0, v7, v1

    .line 57
    .line 58
    aput-object v5, v7, v6

    .line 59
    .line 60
    const-string v5, "peekInt"

    .line 61
    .line 62
    invoke-virtual {v2, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 63
    .line 64
    .line 65
    new-array v5, v3, [Ljava/lang/Class;

    .line 66
    .line 67
    aput-object p0, v5, v1

    .line 68
    .line 69
    sget-object v7, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    aput-object v7, v5, v6

    .line 72
    .line 73
    const-string v7, "pokeByte"

    .line 74
    .line 75
    invoke-virtual {v2, v7, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    new-array v5, v6, [Ljava/lang/Class;

    .line 79
    .line 80
    aput-object p0, v5, v1

    .line 81
    .line 82
    const-string v7, "peekByte"

    .line 83
    .line 84
    invoke-virtual {v2, v7, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 85
    .line 86
    .line 87
    const/4 v5, 0x4

    .line 88
    new-array v7, v5, [Ljava/lang/Class;

    .line 89
    .line 90
    aput-object p0, v7, v1

    .line 91
    .line 92
    aput-object v0, v7, v6

    .line 93
    .line 94
    aput-object v8, v7, v3

    .line 95
    .line 96
    aput-object v8, v7, v4

    .line 97
    .line 98
    const-string v9, "pokeByteArray"

    .line 99
    .line 100
    invoke-virtual {v2, v9, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 101
    .line 102
    .line 103
    new-array v5, v5, [Ljava/lang/Class;

    .line 104
    .line 105
    aput-object p0, v5, v1

    .line 106
    .line 107
    aput-object v0, v5, v6

    .line 108
    .line 109
    aput-object v8, v5, v3

    .line 110
    .line 111
    aput-object v8, v5, v4

    .line 112
    .line 113
    const-string p0, "peekByteArray"

    .line 114
    .line 115
    invoke-virtual {v2, p0, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    .line 118
    return v6

    .line 119
    :catchall_0
    return v1
.end method

.method public static zzt(Ljava/lang/Object;J)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhh;->zzf(Ljava/lang/Object;J)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static zzu()Z
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/auth/zzhi;->zzg:Z

    return v0
.end method

.method public static zzv()Z
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/auth/zzhi;->zzf:Z

    return v0
.end method

.method private static zzw(Ljava/lang/Class;)I
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/android/gms/internal/auth/zzhi;->zzg:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/auth/zzhh;->zzg(Ljava/lang/Class;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, -0x1

    .line 13
    return p0
.end method

.method private static zzx(Ljava/lang/Class;)I
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/android/gms/internal/auth/zzhi;->zzg:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhi;->zze:Lcom/google/android/gms/internal/auth/zzhh;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/auth/zzhh;->zzh(Ljava/lang/Class;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, -0x1

    .line 13
    return p0
.end method

.method private static zzy()Ljava/lang/reflect/Field;
    .locals 3

    .line 1
    sget v0, Lcom/google/android/gms/internal/auth/zzdr;->zza:I

    .line 2
    .line 3
    const-string v0, "effectiveDirectAddress"

    .line 4
    .line 5
    const-class v1, Ljava/nio/Buffer;

    .line 6
    .line 7
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzz(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-string v0, "address"

    .line 14
    .line 15
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/auth/zzhi;->zzz(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    :cond_1
    return-object v0
.end method

.method private static zzz(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    const/4 p0, 0x0

    .line 7
    :goto_0
    return-object p0
.end method
