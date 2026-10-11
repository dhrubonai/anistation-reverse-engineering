.class final Lcom/google/android/gms/internal/auth/zzhm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/auth/zzhk;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhi;->zzu()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhi;->zzv()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget v0, Lcom/google/android/gms/internal/auth/zzdr;->zza:I

    .line 14
    .line 15
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/auth/zzhl;

    .line 16
    .line 17
    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/zzhl;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/google/android/gms/internal/auth/zzhm;->zza:Lcom/google/android/gms/internal/auth/zzhk;

    .line 21
    .line 22
    return-void
.end method

.method public static bridge synthetic zza([BII)I
    .locals 6

    .line 1
    add-int/lit8 v0, p1, -0x1

    .line 2
    .line 3
    aget-byte v0, p0, v0

    .line 4
    .line 5
    sub-int/2addr p2, p1

    .line 6
    const/16 v1, -0xc

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    if-eqz p2, :cond_4

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/16 v4, -0x41

    .line 13
    .line 14
    if-eq p2, v3, :cond_2

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    if-ne p2, v5, :cond_1

    .line 18
    .line 19
    aget-byte p2, p0, p1

    .line 20
    .line 21
    add-int/2addr p1, v3

    .line 22
    aget-byte p0, p0, p1

    .line 23
    .line 24
    if-gt v0, v1, :cond_5

    .line 25
    .line 26
    if-gt p2, v4, :cond_5

    .line 27
    .line 28
    if-le p0, v4, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    shl-int/lit8 p1, p2, 0x8

    .line 32
    .line 33
    xor-int/2addr p1, v0

    .line 34
    shl-int/lit8 p0, p0, 0x10

    .line 35
    .line 36
    xor-int v0, p1, p0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :cond_2
    aget-byte p0, p0, p1

    .line 46
    .line 47
    if-gt v0, v1, :cond_5

    .line 48
    .line 49
    if-le p0, v4, :cond_3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    shl-int/lit8 p0, p0, 0x8

    .line 53
    .line 54
    xor-int/2addr v0, p0

    .line 55
    goto :goto_1

    .line 56
    :cond_4
    if-le v0, v1, :cond_6

    .line 57
    .line 58
    :cond_5
    :goto_0
    move v0, v2

    .line 59
    :cond_6
    :goto_1
    return v0
.end method

.method public static zzb([BII)Ljava/lang/String;
    .locals 10

    .line 1
    array-length v0, p0

    .line 2
    or-int v1, p1, p2

    .line 3
    .line 4
    sub-int v2, v0, p1

    .line 5
    .line 6
    sub-int/2addr v2, p2

    .line 7
    or-int/2addr v1, v2

    .line 8
    const/4 v2, 0x0

    .line 9
    if-ltz v1, :cond_a

    .line 10
    .line 11
    add-int v0, p1, p2

    .line 12
    .line 13
    new-array p2, p2, [C

    .line 14
    .line 15
    move v1, v2

    .line 16
    :goto_0
    if-ge p1, v0, :cond_1

    .line 17
    .line 18
    aget-byte v3, p0, p1

    .line 19
    .line 20
    invoke-static {v3}, Lcom/google/android/gms/internal/auth/zzhj;->zzd(B)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    add-int/lit8 v4, v1, 0x1

    .line 30
    .line 31
    int-to-char v3, v3

    .line 32
    aput-char v3, p2, v1

    .line 33
    .line 34
    move v1, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    :goto_1
    if-ge p1, v0, :cond_9

    .line 37
    .line 38
    add-int/lit8 v3, p1, 0x1

    .line 39
    .line 40
    aget-byte p1, p0, p1

    .line 41
    .line 42
    invoke-static {p1}, Lcom/google/android/gms/internal/auth/zzhj;->zzd(B)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    add-int/lit8 v4, v1, 0x1

    .line 49
    .line 50
    int-to-char p1, p1

    .line 51
    aput-char p1, p2, v1

    .line 52
    .line 53
    move p1, v3

    .line 54
    :goto_2
    move v1, v4

    .line 55
    if-ge p1, v0, :cond_1

    .line 56
    .line 57
    aget-byte v3, p0, p1

    .line 58
    .line 59
    invoke-static {v3}, Lcom/google/android/gms/internal/auth/zzhj;->zzd(B)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 67
    .line 68
    add-int/lit8 v4, v1, 0x1

    .line 69
    .line 70
    int-to-char v3, v3

    .line 71
    aput-char v3, p2, v1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    const/16 v4, -0x20

    .line 75
    .line 76
    if-ge p1, v4, :cond_5

    .line 77
    .line 78
    if-ge v3, v0, :cond_4

    .line 79
    .line 80
    add-int/lit8 v4, v3, 0x1

    .line 81
    .line 82
    add-int/lit8 v5, v1, 0x1

    .line 83
    .line 84
    aget-byte v3, p0, v3

    .line 85
    .line 86
    invoke-static {p1, v3, p2, v1}, Lcom/google/android/gms/internal/auth/zzhj;->zzc(BB[CI)V

    .line 87
    .line 88
    .line 89
    move p1, v4

    .line 90
    move v1, v5

    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzb()Lcom/google/android/gms/internal/auth/zzfa;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    throw p0

    .line 97
    :cond_5
    const/16 v4, -0x10

    .line 98
    .line 99
    if-ge p1, v4, :cond_7

    .line 100
    .line 101
    add-int/lit8 v4, v0, -0x1

    .line 102
    .line 103
    if-ge v3, v4, :cond_6

    .line 104
    .line 105
    add-int/lit8 v4, v3, 0x1

    .line 106
    .line 107
    add-int/lit8 v5, v4, 0x1

    .line 108
    .line 109
    add-int/lit8 v6, v1, 0x1

    .line 110
    .line 111
    aget-byte v3, p0, v3

    .line 112
    .line 113
    aget-byte v4, p0, v4

    .line 114
    .line 115
    invoke-static {p1, v3, v4, p2, v1}, Lcom/google/android/gms/internal/auth/zzhj;->zzb(BBB[CI)V

    .line 116
    .line 117
    .line 118
    move p1, v5

    .line 119
    move v1, v6

    .line 120
    goto :goto_1

    .line 121
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzb()Lcom/google/android/gms/internal/auth/zzfa;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    throw p0

    .line 126
    :cond_7
    add-int/lit8 v4, v0, -0x2

    .line 127
    .line 128
    if-ge v3, v4, :cond_8

    .line 129
    .line 130
    add-int/lit8 v4, v3, 0x1

    .line 131
    .line 132
    add-int/lit8 v5, v4, 0x1

    .line 133
    .line 134
    add-int/lit8 v9, v5, 0x1

    .line 135
    .line 136
    aget-byte v6, p0, v3

    .line 137
    .line 138
    aget-byte v7, p0, v4

    .line 139
    .line 140
    aget-byte v8, p0, v5

    .line 141
    .line 142
    move v3, p1

    .line 143
    move v4, v6

    .line 144
    move v5, v7

    .line 145
    move v6, v8

    .line 146
    move-object v7, p2

    .line 147
    move v8, v1

    .line 148
    invoke-static/range {v3 .. v8}, Lcom/google/android/gms/internal/auth/zzhj;->zza(BBBB[CI)V

    .line 149
    .line 150
    .line 151
    add-int/lit8 v1, v1, 0x2

    .line 152
    .line 153
    move p1, v9

    .line 154
    goto :goto_1

    .line 155
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzfa;->zzb()Lcom/google/android/gms/internal/auth/zzfa;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    throw p0

    .line 160
    :cond_9
    new-instance p0, Ljava/lang/String;

    .line 161
    .line 162
    invoke-direct {p0, p2, v2, v1}, Ljava/lang/String;-><init>([CII)V

    .line 163
    .line 164
    .line 165
    return-object p0

    .line 166
    :cond_a
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 167
    .line 168
    const/4 v1, 0x3

    .line 169
    new-array v1, v1, [Ljava/lang/Object;

    .line 170
    .line 171
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    aput-object v0, v1, v2

    .line 176
    .line 177
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    const/4 v0, 0x1

    .line 182
    aput-object p1, v1, v0

    .line 183
    .line 184
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    const/4 p2, 0x2

    .line 189
    aput-object p1, v1, p2

    .line 190
    .line 191
    const-string p1, "buffer length=%d, index=%d, size=%d"

    .line 192
    .line 193
    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p0
.end method

.method public static zzc([B)Z
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhm;->zza:Lcom/google/android/gms/internal/auth/zzhk;

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, p0, v2, v1}, Lcom/google/android/gms/internal/auth/zzhk;->zzb([BII)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public static zzd([BII)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzhm;->zza:Lcom/google/android/gms/internal/auth/zzhk;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/zzhk;->zzb([BII)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
