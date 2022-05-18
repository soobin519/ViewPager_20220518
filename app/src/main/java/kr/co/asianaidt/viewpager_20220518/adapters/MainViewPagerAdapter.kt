package kr.co.asianaidt.viewpager_20220518.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.asianaidt.viewpager_20220518.Fragments.HelloFragment
import kr.co.asianaidt.viewpager_20220518.Fragments.NameFragment
import kr.co.asianaidt.viewpager_20220518.Fragments.PhoneFragment
import kr.co.asianaidt.viewpager_20220518.MainActivity

class MainViewPagerAdapter(fm: FragmentManager) :FragmentPagerAdapter(fm) {

    //각 페이지별 제목 설정
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "이름"
            1 -> "연락처"
            else -> "인사말"
        }
    }

    //몇장짜리 뷰페이저인지 장수를 리턴
    override fun getCount() = 3


    //포지션에따라 어떤 위치에 맞는 fragment(객체들을) 리턴
    override fun getItem(position: Int): Fragment {

        return when(position){
            0-> NameFragment()
            1-> PhoneFragment()
            else -> HelloFragment()
        }
    }
}