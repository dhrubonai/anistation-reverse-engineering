.class public final Lcom/google/android/gms/common/api/internal/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final a:Lcom/google/android/gms/common/api/internal/h;

.field public final b:I

.field public final c:Lcom/google/android/gms/common/api/internal/a;

.field public final d:J

.field public final e:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/h;ILcom/google/android/gms/common/api/internal/a;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/n0;->a:Lcom/google/android/gms/common/api/internal/h;

    iput p2, p0, Lcom/google/android/gms/common/api/internal/n0;->b:I

    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/n0;->c:Lcom/google/android/gms/common/api/internal/a;

    iput-wide p4, p0, Lcom/google/android/gms/common/api/internal/n0;->d:J

    iput-wide p6, p0, Lcom/google/android/gms/common/api/internal/n0;->e:J

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/internal/g0;Lcom/google/android/gms/common/internal/f;I)Lcom/google/android/gms/common/internal/i;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getTelemetryConfiguration()Lcom/google/android/gms/common/internal/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_7

    .line 6
    .line 7
    iget-boolean v0, p1, Lcom/google/android/gms/common/internal/i;->b:Z

    .line 8
    .line 9
    if-eqz v0, :cond_7

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x1

    .line 13
    iget-object v2, p1, Lcom/google/android/gms/common/internal/i;->d:[I

    .line 14
    .line 15
    if-nez v2, :cond_3

    .line 16
    .line 17
    iget-object v2, p1, Lcom/google/android/gms/common/internal/i;->f:[I

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto :goto_4

    .line 22
    :cond_0
    move v3, v0

    .line 23
    :goto_0
    array-length v4, v2

    .line 24
    if-ge v3, v4, :cond_2

    .line 25
    .line 26
    aget v4, v2, v3

    .line 27
    .line 28
    if-ne v4, p2, :cond_1

    .line 29
    .line 30
    move v0, v1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    :goto_1
    if-eqz v0, :cond_6

    .line 36
    .line 37
    goto :goto_5

    .line 38
    :cond_3
    move v3, v0

    .line 39
    :goto_2
    array-length v4, v2

    .line 40
    if-ge v3, v4, :cond_5

    .line 41
    .line 42
    aget v4, v2, v3

    .line 43
    .line 44
    if-ne v4, p2, :cond_4

    .line 45
    .line 46
    move v0, v1

    .line 47
    goto :goto_3

    .line 48
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_5
    :goto_3
    if-nez v0, :cond_6

    .line 52
    .line 53
    goto :goto_5

    .line 54
    :cond_6
    :goto_4
    iget p0, p0, Lcom/google/android/gms/common/api/internal/g0;->l:I

    .line 55
    .line 56
    iget p2, p1, Lcom/google/android/gms/common/internal/i;->e:I

    .line 57
    .line 58
    if-ge p0, p2, :cond_7

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_7
    :goto_5
    const/4 p0, 0x0

    .line 62
    return-object p0
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/n0;->a:Lcom/google/android/gms/common/api/internal/h;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/h;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/s;->a()Lcom/google/android/gms/common/internal/s;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v2, v2, Lcom/google/android/gms/common/internal/s;->a:Lcom/google/android/gms/common/internal/t;

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    iget-boolean v3, v2, Lcom/google/android/gms/common/internal/t;->b:Z

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-void

    .line 26
    :cond_2
    :goto_0
    iget-object v3, v1, Lcom/google/android/gms/common/api/internal/h;->A:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/n0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lcom/google/android/gms/common/api/internal/g0;

    .line 35
    .line 36
    if-eqz v3, :cond_e

    .line 37
    .line 38
    iget-object v4, v3, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 39
    .line 40
    instance-of v5, v4, Lcom/google/android/gms/common/internal/f;

    .line 41
    .line 42
    if-nez v5, :cond_3

    .line 43
    .line 44
    goto/16 :goto_a

    .line 45
    .line 46
    :cond_3
    check-cast v4, Lcom/google/android/gms/common/internal/f;

    .line 47
    .line 48
    iget-wide v5, v0, Lcom/google/android/gms/common/api/internal/n0;->d:J

    .line 49
    .line 50
    const-wide/16 v7, 0x0

    .line 51
    .line 52
    cmp-long v9, v5, v7

    .line 53
    .line 54
    const/4 v10, 0x1

    .line 55
    const/4 v11, 0x0

    .line 56
    if-lez v9, :cond_4

    .line 57
    .line 58
    move v12, v10

    .line 59
    goto :goto_1

    .line 60
    :cond_4
    move v12, v11

    .line 61
    :goto_1
    invoke-virtual {v4}, Lcom/google/android/gms/common/internal/f;->getGCoreServiceId()I

    .line 62
    .line 63
    .line 64
    move-result v23

    .line 65
    const/16 v13, 0x64

    .line 66
    .line 67
    if-eqz v2, :cond_8

    .line 68
    .line 69
    iget-boolean v14, v2, Lcom/google/android/gms/common/internal/t;->c:Z

    .line 70
    .line 71
    and-int/2addr v12, v14

    .line 72
    invoke-virtual {v4}, Lcom/google/android/gms/common/internal/f;->hasConnectionInfo()Z

    .line 73
    .line 74
    .line 75
    move-result v14

    .line 76
    if-eqz v14, :cond_7

    .line 77
    .line 78
    invoke-virtual {v4}, Lcom/google/android/gms/common/internal/f;->isConnecting()Z

    .line 79
    .line 80
    .line 81
    move-result v14

    .line 82
    if-nez v14, :cond_7

    .line 83
    .line 84
    iget v12, v0, Lcom/google/android/gms/common/api/internal/n0;->b:I

    .line 85
    .line 86
    invoke-static {v3, v4, v12}, Lcom/google/android/gms/common/api/internal/n0;->a(Lcom/google/android/gms/common/api/internal/g0;Lcom/google/android/gms/common/internal/f;I)Lcom/google/android/gms/common/internal/i;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    if-nez v3, :cond_5

    .line 91
    .line 92
    return-void

    .line 93
    :cond_5
    iget-boolean v4, v3, Lcom/google/android/gms/common/internal/i;->c:Z

    .line 94
    .line 95
    if-eqz v4, :cond_6

    .line 96
    .line 97
    if-lez v9, :cond_6

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_6
    move v10, v11

    .line 101
    :goto_2
    iget v3, v3, Lcom/google/android/gms/common/internal/i;->e:I

    .line 102
    .line 103
    move v12, v10

    .line 104
    goto :goto_3

    .line 105
    :cond_7
    iget v3, v2, Lcom/google/android/gms/common/internal/t;->e:I

    .line 106
    .line 107
    :goto_3
    iget v4, v2, Lcom/google/android/gms/common/internal/t;->d:I

    .line 108
    .line 109
    iget v2, v2, Lcom/google/android/gms/common/internal/t;->a:I

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_8
    const/16 v4, 0x1388

    .line 113
    .line 114
    move v2, v11

    .line 115
    move v3, v13

    .line 116
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    const/4 v10, -0x1

    .line 121
    if-eqz v9, :cond_9

    .line 122
    .line 123
    move v15, v11

    .line 124
    move/from16 v16, v15

    .line 125
    .line 126
    goto :goto_8

    .line 127
    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-eqz v9, :cond_a

    .line 132
    .line 133
    move v11, v13

    .line 134
    goto :goto_6

    .line 135
    :cond_a
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    instance-of v11, v9, Lcom/google/android/gms/common/api/j;

    .line 140
    .line 141
    if-eqz v11, :cond_c

    .line 142
    .line 143
    check-cast v9, Lcom/google/android/gms/common/api/j;

    .line 144
    .line 145
    invoke-virtual {v9}, Lcom/google/android/gms/common/api/j;->getStatus()Lcom/google/android/gms/common/api/Status;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    iget v11, v9, Lcom/google/android/gms/common/api/Status;->b:I

    .line 150
    .line 151
    iget-object v9, v9, Lcom/google/android/gms/common/api/Status;->e:Lb5/a;

    .line 152
    .line 153
    if-nez v9, :cond_b

    .line 154
    .line 155
    move v9, v10

    .line 156
    goto :goto_5

    .line 157
    :cond_b
    iget v9, v9, Lb5/a;->b:I

    .line 158
    .line 159
    :goto_5
    move/from16 v16, v9

    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_c
    const/16 v9, 0x65

    .line 163
    .line 164
    move v11, v9

    .line 165
    :goto_6
    move/from16 v16, v10

    .line 166
    .line 167
    :goto_7
    move v15, v11

    .line 168
    :goto_8
    if-eqz v12, :cond_d

    .line 169
    .line 170
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 171
    .line 172
    .line 173
    move-result-wide v7

    .line 174
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 175
    .line 176
    .line 177
    move-result-wide v9

    .line 178
    iget-wide v11, v0, Lcom/google/android/gms/common/api/internal/n0;->e:J

    .line 179
    .line 180
    sub-long/2addr v9, v11

    .line 181
    long-to-int v9, v9

    .line 182
    move-wide/from16 v17, v5

    .line 183
    .line 184
    move-wide/from16 v19, v7

    .line 185
    .line 186
    move/from16 v24, v9

    .line 187
    .line 188
    goto :goto_9

    .line 189
    :cond_d
    move-wide/from16 v17, v7

    .line 190
    .line 191
    move-wide/from16 v19, v17

    .line 192
    .line 193
    move/from16 v24, v10

    .line 194
    .line 195
    :goto_9
    new-instance v5, Lcom/google/android/gms/common/internal/q;

    .line 196
    .line 197
    iget v14, v0, Lcom/google/android/gms/common/api/internal/n0;->b:I

    .line 198
    .line 199
    const/16 v21, 0x0

    .line 200
    .line 201
    const/16 v22, 0x0

    .line 202
    .line 203
    move-object v13, v5

    .line 204
    invoke-direct/range {v13 .. v24}, Lcom/google/android/gms/common/internal/q;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 205
    .line 206
    .line 207
    int-to-long v6, v4

    .line 208
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 209
    .line 210
    new-instance v4, Lcom/google/android/gms/common/api/internal/o0;

    .line 211
    .line 212
    move-object v14, v4

    .line 213
    move-object v15, v5

    .line 214
    move/from16 v16, v2

    .line 215
    .line 216
    move-wide/from16 v17, v6

    .line 217
    .line 218
    move/from16 v19, v3

    .line 219
    .line 220
    invoke-direct/range {v14 .. v19}, Lcom/google/android/gms/common/api/internal/o0;-><init>(Lcom/google/android/gms/common/internal/q;IJI)V

    .line 221
    .line 222
    .line 223
    const/16 v2, 0x12

    .line 224
    .line 225
    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 230
    .line 231
    .line 232
    :cond_e
    :goto_a
    return-void
.end method
