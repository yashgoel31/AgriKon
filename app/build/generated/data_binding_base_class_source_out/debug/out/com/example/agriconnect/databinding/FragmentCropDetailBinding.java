// Generated by data binding compiler. Do not edit!
package com.example.agriconnect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.agriconnect.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCropDetailBinding extends ViewDataBinding {
  @NonNull
  public final TextView CropDetail;

  @NonNull
  public final ImageView CropImage;

  @NonNull
  public final TextView CropName;

  @NonNull
  public final TextView CropWaterLevel;

  @NonNull
  public final ScrollView scrollView;

  protected FragmentCropDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView CropDetail, ImageView CropImage, TextView CropName, TextView CropWaterLevel,
      ScrollView scrollView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.CropDetail = CropDetail;
    this.CropImage = CropImage;
    this.CropName = CropName;
    this.CropWaterLevel = CropWaterLevel;
    this.scrollView = scrollView;
  }

  @NonNull
  public static FragmentCropDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_crop__detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCropDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCropDetailBinding>inflateInternal(inflater, R.layout.fragment_crop__detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCropDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_crop__detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCropDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCropDetailBinding>inflateInternal(inflater, R.layout.fragment_crop__detail, null, false, component);
  }

  public static FragmentCropDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentCropDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCropDetailBinding)bind(component, view, R.layout.fragment_crop__detail);
  }
}
