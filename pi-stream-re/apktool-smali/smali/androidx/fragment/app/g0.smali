.class public final Landroidx/fragment/app/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final a:Landroidx/fragment/app/s0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/s0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/g0;->a:Landroidx/fragment/app/s0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 11

    .line 2
    const-class v0, Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/g0;->a:Landroidx/fragment/app/s0;

    if-eqz v0, :cond_0

    .line 3
    new-instance p1, Landroidx/fragment/app/FragmentContainerView;

    invoke-direct {p1, p3, p4, v1}, Landroidx/fragment/app/FragmentContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/s0;)V

    return-object p1

    :cond_0
    const-string v0, "fragment"

    .line 4
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    return-object v0

    :cond_1
    const-string p2, "class"

    .line 5
    invoke-interface {p4, v0, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 6
    sget-object v2, Lu0/a;->a:[I

    invoke-virtual {p3, p4, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/4 v3, 0x0

    if-nez p2, :cond_2

    .line 7
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_2
    const/4 v4, 0x1

    const/4 v5, -0x1

    .line 8
    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    const/4 v7, 0x2

    .line 9
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 10
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_16

    .line 11
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    .line 12
    :try_start_0
    invoke-static {v2, p2}, Landroidx/fragment/app/m0;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 13
    const-class v9, Landroidx/fragment/app/y;

    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move v2, v3

    :goto_0
    if-nez v2, :cond_3

    goto/16 :goto_8

    :cond_3
    if-eqz p1, :cond_4

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    goto :goto_1

    :cond_4
    move v2, v3

    :goto_1
    if-ne v2, v5, :cond_6

    if-ne v6, v5, :cond_6

    if-eqz v8, :cond_5

    goto :goto_2

    .line 15
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_2
    if-eq v6, v5, :cond_7

    .line 16
    invoke-virtual {v1, v6}, Landroidx/fragment/app/s0;->B(I)Landroidx/fragment/app/y;

    move-result-object v9

    goto :goto_3

    :cond_7
    move-object v9, v0

    :goto_3
    if-nez v9, :cond_8

    if-eqz v8, :cond_8

    .line 17
    invoke-virtual {v1, v8}, Landroidx/fragment/app/s0;->C(Ljava/lang/String;)Landroidx/fragment/app/y;

    move-result-object v9

    :cond_8
    if-nez v9, :cond_9

    if-eq v2, v5, :cond_9

    .line 18
    invoke-virtual {v1, v2}, Landroidx/fragment/app/s0;->B(I)Landroidx/fragment/app/y;

    move-result-object v9

    :cond_9
    const-string v5, "Fragment "

    const-string v10, "FragmentManager"

    if-nez v9, :cond_d

    .line 19
    invoke-virtual {v1}, Landroidx/fragment/app/s0;->E()Landroidx/fragment/app/m0;

    move-result-object p4

    .line 20
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 21
    invoke-virtual {p4, p2}, Landroidx/fragment/app/m0;->a(Ljava/lang/String;)Landroidx/fragment/app/y;

    move-result-object v9

    .line 22
    iput-boolean v4, v9, Landroidx/fragment/app/y;->D:Z

    if-eqz v6, :cond_a

    move p3, v6

    goto :goto_4

    :cond_a
    move p3, v2

    .line 23
    :goto_4
    iput p3, v9, Landroidx/fragment/app/y;->M:I

    .line 24
    iput v2, v9, Landroidx/fragment/app/y;->N:I

    .line 25
    iput-object v8, v9, Landroidx/fragment/app/y;->O:Ljava/lang/String;

    .line 26
    iput-boolean v4, v9, Landroidx/fragment/app/y;->E:Z

    .line 27
    iput-object v1, v9, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 28
    iget-object p3, v1, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 29
    iput-object p3, v9, Landroidx/fragment/app/y;->J:Landroidx/fragment/app/a0;

    .line 30
    iget-object p4, p3, Landroidx/fragment/app/a0;->D:Landroid/content/Context;

    .line 31
    iput-boolean v4, v9, Landroidx/fragment/app/y;->T:Z

    if-nez p3, :cond_b

    goto :goto_5

    .line 32
    :cond_b
    iget-object v0, p3, Landroidx/fragment/app/a0;->C:Landroid/app/Activity;

    :goto_5
    if-eqz v0, :cond_c

    .line 33
    iput-boolean v4, v9, Landroidx/fragment/app/y;->T:Z

    .line 34
    :cond_c
    invoke-virtual {v1, v9}, Landroidx/fragment/app/s0;->a(Landroidx/fragment/app/y;)Landroidx/fragment/app/z0;

    move-result-object p3

    .line 35
    invoke-static {v7}, Landroidx/fragment/app/s0;->H(I)Z

    move-result p4

    if-eqz p4, :cond_10

    .line 36
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has been inflated via the <fragment> tag: id=0x"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 38
    invoke-static {v10, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_7

    .line 39
    :cond_d
    iget-boolean p3, v9, Landroidx/fragment/app/y;->E:Z

    if-nez p3, :cond_15

    .line 40
    iput-boolean v4, v9, Landroidx/fragment/app/y;->E:Z

    .line 41
    iput-object v1, v9, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 42
    iget-object p3, v1, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 43
    iput-object p3, v9, Landroidx/fragment/app/y;->J:Landroidx/fragment/app/a0;

    .line 44
    iget-object p4, p3, Landroidx/fragment/app/a0;->D:Landroid/content/Context;

    .line 45
    iput-boolean v4, v9, Landroidx/fragment/app/y;->T:Z

    if-nez p3, :cond_e

    goto :goto_6

    .line 46
    :cond_e
    iget-object v0, p3, Landroidx/fragment/app/a0;->C:Landroid/app/Activity;

    :goto_6
    if-eqz v0, :cond_f

    .line 47
    iput-boolean v4, v9, Landroidx/fragment/app/y;->T:Z

    .line 48
    :cond_f
    invoke-virtual {v1, v9}, Landroidx/fragment/app/s0;->f(Landroidx/fragment/app/y;)Landroidx/fragment/app/z0;

    move-result-object p3

    .line 49
    invoke-static {v7}, Landroidx/fragment/app/s0;->H(I)Z

    move-result p4

    if-eqz p4, :cond_10

    .line 50
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Retained Fragment "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has been re-attached via the <fragment> tag: id=0x"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 52
    invoke-static {v10, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    :cond_10
    :goto_7
    check-cast p1, Landroid/view/ViewGroup;

    sget-object p4, Lv0/c;->a:Lv0/b;

    .line 54
    new-instance p4, Lv0/d;

    invoke-direct {p4, v9, p1, v3}, Lv0/d;-><init>(Landroidx/fragment/app/y;Landroid/view/ViewGroup;I)V

    .line 55
    invoke-static {p4}, Lv0/c;->c(Lv0/e;)V

    .line 56
    invoke-static {v9}, Lv0/c;->a(Landroidx/fragment/app/y;)Lv0/b;

    move-result-object v0

    .line 57
    iget-object v1, v0, Lv0/b;->a:Ljava/util/Set;

    .line 58
    sget-object v2, Lv0/a;->d:Lv0/a;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 59
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lv0/d;

    invoke-static {v0, v1, v2}, Lv0/c;->e(Lv0/b;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 60
    invoke-static {v0, p4}, Lv0/c;->b(Lv0/b;Lv0/e;)V

    .line 61
    :cond_11
    iput-object p1, v9, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 62
    invoke-virtual {p3}, Landroidx/fragment/app/z0;->k()V

    .line 63
    invoke-virtual {p3}, Landroidx/fragment/app/z0;->j()V

    .line 64
    iget-object p1, v9, Landroidx/fragment/app/y;->V:Landroid/view/View;

    if-eqz p1, :cond_14

    if-eqz v6, :cond_12

    .line 65
    invoke-virtual {p1, v6}, Landroid/view/View;->setId(I)V

    .line 66
    :cond_12
    iget-object p1, v9, Landroidx/fragment/app/y;->V:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_13

    .line 67
    iget-object p1, v9, Landroidx/fragment/app/y;->V:Landroid/view/View;

    invoke-virtual {p1, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 68
    :cond_13
    iget-object p1, v9, Landroidx/fragment/app/y;->V:Landroid/view/View;

    new-instance p2, Landroidx/fragment/app/f0;

    invoke-direct {p2, p0, p3}, Landroidx/fragment/app/f0;-><init>(Landroidx/fragment/app/g0;Landroidx/fragment/app/z0;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 69
    iget-object p1, v9, Landroidx/fragment/app/y;->V:Landroid/view/View;

    return-object p1

    .line 70
    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p3, " did not create a view."

    .line 71
    invoke-static {v5, p2, p3}, Lr/f;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 72
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 73
    :cond_15
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Duplicate id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", tag "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", or parent id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " with another fragment for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_16
    :goto_8
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/g0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
