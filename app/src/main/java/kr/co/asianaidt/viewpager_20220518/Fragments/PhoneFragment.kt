package kr.co.asianaidt.viewpager_20220518.Fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kr.co.asianaidt.viewpager_20220518.R


class PhoneFragment : Fragment(){

    //어떤 xml을 꿀어다 사용할지 결정하는 함수
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate( R.layout.fragment_phone, container, false )
    }

    //동작 관련 코드 전달 함수
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }

}